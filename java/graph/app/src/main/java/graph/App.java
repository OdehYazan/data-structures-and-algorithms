package graph;

public class App {


  public static void main(String[] args) {

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
    String[] trip2 = {"Arendelle" , "Monstropolis", "Naboo"};
    String[] trip3 = {"Naboo" , "Pandora"};
    String[] trip4 = {"Narnia" , "Arendelle" , "Naboo"};

      System.out.println(graph);
      System.out.println(graph.getNodes());
      System.out.println(graph.getNeighbors("Pandora"));
      System.out.println(graph.getNeighbors("Narnia"));
      System.out.println(graph.getNeighbors("Metroville"));
      System.out.println(graph.size());

    System.out.println(graph.breadthFirst("Naboo"));
    System.out.println(graph.breadthFirst("Narnia"));
    System.out.println(graph.breadthFirst("Pandora"));

    System.out.println(graph.businessTrip("Metroville",trip));
    System.out.println(graph.businessTrip("Arendelle",trip2));
    System.out.println(graph.businessTrip("Naboo",trip3));
    System.out.println(graph.businessTrip("Narnia",trip4));

    System.out.println(graph.depthFirst("Pandora"));
    System.out.println(graph.depthFirst("Narnia"));
    System.out.println(graph.depthFirst("Naboo"));



  }
}
