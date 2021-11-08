package hastable;

public class Node<T> {
  protected String key;
  protected T value;
  protected Node next;

  // Constructor
  public Node(String key, T value) {
    this.key = key;
    this.value = value;
    this.next = null;
  }

  // Getters and setters
  public String getKey() {
    return this.key;
  }

  public void setKey(String newKey) {
    this.key = newKey;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T newValue) {
    this.value = newValue;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node newNext) {
    this.next = newNext;
  }
}
