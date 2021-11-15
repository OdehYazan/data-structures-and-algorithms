package graph;

public class App {


  public static void main(String[] args) {

    Graph graph = new Graph();
    graph.addNode("10");
    graph.addNode("5");
    graph.addNode("1");
    graph.addNode("4");
    graph.addNode("7");
    graph.addNode("6");

    graph.addEdge("10" , "1");
    graph.addEdge("1" , "5");
    graph.addEdge("7" , "10");
    graph.addEdge("4" , "5");
    graph.addEdge("4" , "6");
    graph.addEdge("7" , "6");

      System.out.println(graph);
      System.out.println(graph.getNodes());
      System.out.println(graph.getNeighbors("10"));
      System.out.println(graph.getNeighbors("7"));
      System.out.println(graph.getNeighbors("1"));
      System.out.println(graph.size());

    System.out.println(graph.breadthFirst("6"));
    System.out.println(graph.breadthFirst("7"));
    System.out.println(graph.breadthFirst("10"));



  }
}
