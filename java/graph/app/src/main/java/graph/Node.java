package graph;

import java.util.HashSet;

public class Node<T> {
  protected T value;
  protected HashSet<Edge> neighbors;

  public Node(T value) {
    this.value = value;
    this.neighbors = new HashSet<>();
  }
}
