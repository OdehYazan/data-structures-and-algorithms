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



  public void stringOutput() {

      if (head == null) {
        System.out.println("List is empty");
      } else {
        LinkedListNode current;
        current = head;


        System.out.print("HEAD -> ");

        while (current != null) {

          System.out.print("{"+current.getData()+"}" + " -> ");
          current = current.getNext();
        }

        System.out.println("NULL");
      }
    }

  }

