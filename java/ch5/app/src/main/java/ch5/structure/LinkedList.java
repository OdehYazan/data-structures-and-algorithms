package ch5.structure;

import ch5.data.LinkedListNode;



public class LinkedList {

    public LinkedListNode head;

    public LinkedList() {
    }

    public void insert(String data) {
      if (head == null) {
        LinkedListNode node = new LinkedListNode(data);
        head = node;
      } else {
        // else traverse the list and get to the end
        // make last node point to the new node
        LinkedListNode current;
        current = head;
        while (current.getNext() != null) {
          // moves the current reference along the list
          current = current.getNext();
        }

        LinkedListNode node = new LinkedListNode( data);
        current.setNext(node);

      }
    }




      public boolean includes( String val) {

        LinkedListNode current;
        current = head;
        while (current != null) // traversing the list
        {
          if (current.getData() == val) {
            return true;
          }
            current = current.getNext();
          }
          return false;
        }


  public LinkedListNode join(LinkedList a, LinkedList b )
  {
    LinkedListNode a_curr = a.head, b_Curr = b.head;
    LinkedListNode a_next, b_next;



    while (a_curr != null && b_Curr != null) {



      a_next = a_curr.getNext();

      b_next = b_Curr.getNext();


      b_Curr.setNext(a_next);
      a_curr.setNext(b_Curr);


      a_curr = a_next;
      b_Curr = b_next;
    }
     b.head = b_Curr;
    return a.head;

  }





  public String stringOutput() {

      String output="";
      if (head == null) {
        return "List is empty";
      } else {
        LinkedListNode current;
        current = head;




        while (current != null) {

          output+="{"+current.getData()+"}" + " -> ";
          current = current.getNext();
        }

        return "HEAD -> "+output+ "NULL";
      }
    }

  }

