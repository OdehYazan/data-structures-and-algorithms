package graph;

public class Edge {
  protected Node start;
  protected Node end;
  protected Comparable weight;

  public Edge(Node start, Node end, Comparable weight) {
    this.start = start;
    this.end = end;
    this.weight = weight;
  }
}
