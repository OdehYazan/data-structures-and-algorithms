/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  public void breadth_First() {
    Graph graph = new Graph();
    graph.addNode("10");
    graph.addNode("5");
    graph.addNode("1");
    graph.addNode("4");
    graph.addNode("7");
    graph.addNode("6");

    graph.addEdge("10", "1");
    graph.addEdge("1", "5");
    graph.addEdge("7", "10");
    graph.addEdge("4", "5");
    graph.addEdge("4", "6");
    graph.addEdge("7", "6");

    assertEquals("[6, 4, 7, 5, 10, 1]", graph.breadthFirst("6").toString());

  }
}