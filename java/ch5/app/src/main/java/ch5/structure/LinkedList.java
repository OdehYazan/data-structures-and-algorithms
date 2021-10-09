package ch5.structure;

import ch5.data.LinkedListNode;








public class LinkedList {

  public LinkedListNode head;

  public LinkedList() {
  }



  public void add(String data) {
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

  public String append(String data) {
    LinkedListNode current ;
    current=head;
    while (current != null) {
      if (current.next == null) {
        LinkedListNode node = new LinkedListNode(data);
        current.next = node;

      }
      current = current.next;
    }
    return data;
  }

  public void insertBefore(String value, String newValue) {
    if (this.head.getData() == value) {
      this.insert(newValue);
      return;
    } else if (!this.includes(value)) {
      return;
    }

    LinkedListNode current = head;
    while (current != null) {
      if (current.getNext().getData() == value) {
        LinkedListNode node = new LinkedListNode(newValue);
        node.setNext(current.getNext());
        current.setNext(node);
break;
      }
      current = current.getNext();
    }
  }

  public void insertAfter(String value, String newValue) {
    if (!this.includes(value)) {
      return;
    }

    LinkedListNode current = head;
    while (current != null) {
      if (current.getData() == value) {
        LinkedListNode node = new   LinkedListNode(newValue);
        node.setNext(current.getNext());
        current.setNext(node);

      }
      current = current.getNext();
    }
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




