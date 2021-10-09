package ch5.structure;

import ch5.data.LinkedListNode;



public class LinkedList {

    public LinkedListNode head;

    public LinkedList() {
    }

    public String insert(String data) {
      LinkedListNode node = new LinkedListNode(data);
      if (head != null) {

        node.setNext(head);

      }
      head = node;
      return data;
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

