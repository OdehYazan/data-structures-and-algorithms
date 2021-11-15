package graph;

import java.util.Objects;

public class Node<T> {

  public T value;
  public Node<T> next;

  public Node() {}

  public Node(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "" + value;
  }

  public Node<T> getNext() {
    return next;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Node<T> node = (Node<T>) object;
    return Objects.equals(value, node.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
