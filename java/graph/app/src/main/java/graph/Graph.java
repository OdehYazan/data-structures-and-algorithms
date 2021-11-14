package graph;

import java.util.HashSet;

public class Graph<T> {

  protected HashSet<Node> vertices;
  public Graph() {
    this.vertices = new HashSet<>();
  }
  public Node addNode(T value) {
    Node newNode = new Node(value);
    vertices.add(newNode);
    return newNode;
  }
  public void addEdge(Node nodeOne, Node nodeTwo, Comparable weight) {
    Edge edgeOne = new Edge(nodeOne, nodeTwo, weight);
    Edge edgeTwo = new Edge(nodeTwo, nodeOne, weight);
    nodeOne.neighbors.add(edgeOne);
    nodeTwo.neighbors.add(edgeTwo);
  }


  public HashSet<Node> getNodes() {
    return vertices;
  }
  public HashSet<Node> getNeighbors(Node node) {
    HashSet<Edge> neighborsToIterateOver = node.neighbors;
    HashSet<Node> neighbors = new HashSet<>();
    for (Edge edge : neighborsToIterateOver) {
      neighbors.add(edge.end);
    }
    return neighbors;
  }
  public int size() {
    return vertices.size();
  }
}
