package hastable;

public class LinkedList<T> {
  public Node head;

  // Constructor
  public LinkedList() {
    this.head = null;
  }

  // Adds a node with the specified key and value to the end of the LinkedList
  public void append(String key, T value) {
    if (this.head == null) {
      this.head = new Node(key, value);
      return;
    }

    Node current = this.head;
    while (current != null) {
      if (current.getNext() == null) {
        current.setNext(new Node(key, value));
        break;
      }
      current = current.getNext();
    }
  }

  // Returns the value associated with the input key stored in the LinkedList
  public T findValue(String key) {
    Node current = this.head;
    while (current != null) {
      if (current.getKey() == key) {
        return (T) current.getValue();
      }
      current = current.getNext();
    }
    return null;
  }

  // Determines if a specified value is stored in the LinkedList
  public boolean includes(String key) {
    Node current = this.head;
    while (current != null) {
      if (current.getKey() == key) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }
}
