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



    assertEquals("[6, 4, 7, 5, 10, 1]", graph.breadthFirst("6").toString());

  }

  @Test
  public void businessTripTest(){
    Graph graph = new Graph();
    graph.addNode("Pandora");
    graph.addNode("Arendelle");
    graph.addNode("Metroville");
    graph.addNode("Monstropolis");
    graph.addNode("Narnia");
    graph.addNode("Naboo");

    graph.addEdge("Pandora" , "Arendelle",150);
    graph.addEdge("Pandora" , "Metroville",82);
    graph.addEdge("Metroville" , "Arendelle",99);
    graph.addEdge("Metroville" , "Narnia",37);
    graph.addEdge("Metroville" , "Naboo",26);
    graph.addEdge("Metroville" , "Monstropolis",105);
    graph.addEdge("Narnia" , "Naboo",250);
    graph.addEdge("Monstropolis" , "Naboo",73);
    graph.addEdge("Monstropolis" , "Arendelle",42);

    String[] trip = {"Metroville" , "Pandora"};


    assertEquals("true, $82",graph.businessTrip("Metroville",trip).toString());

  }
}
