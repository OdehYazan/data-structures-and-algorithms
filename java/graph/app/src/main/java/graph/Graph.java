package graph;

import java.util.*;

public class Graph <T>{

  public Map< Node<T> , List<Node<T>>> hashList = new HashMap<>();
  public Map<String , Integer> listOfweight = new HashMap<>();

  public Graph() {}

  public Node<T> addNode(T value) {
    Node<T> newNode = new Node<T>(value);
    hashList.put(newNode, new ArrayList<>());
    return newNode;
  }

  public void addEdge(T value1, T value2,int weight) {
    Node<T> node1 = new Node<T>(value1);

    if (value1.equals(value2)) {
      hashList.get(node1).add(node1);
      listOfweight.put(value1 + "->" + value1 , 0);
    } else {
      Node<T> node2 = new Node<T>(value2);
      hashList.get(node1).add(node2);
      hashList.get(node2).add(node1);
      listOfweight.put(value1 + "->" + value2 , weight);
      listOfweight.put(value2 + "->" + value1 , weight);
    }



    listOfweight.put(value1 + "->" + value2 , weight);
    listOfweight.put(value2 + "->" + value1 , weight);
  }

  public Set<Node<T>> getNodes() {
    return hashList.keySet();
  }

  public List<Node<T>> getNeighbors(T value) {
    return hashList.get(new Node<T>(value));
  }

  public int size() {
    return hashList.size();
  }

  @Override
  public String toString() {
    if (hashList.isEmpty()) return null;
    return "" + hashList;
  }

  public List<Node<T>> breadthFirst(T value) {

    Node<T> node = new Node(value);
    if (node.value == null) return null;
    List<Node<T>> nodes = new ArrayList<>();
    Set<Node<T>> visiting = new HashSet<>();
    Queue<T> breadth = new Queue<T>();

    breadth.enqueue((T) node);
    visiting.add(node);

    while (!breadth.isEmpty()) {
      Node<T> front = (Node<T>) breadth.dequeue();
      nodes.add(front);
      for (Node<T> neighbor : getNeighbors(front.value)) {
        if (!visiting.contains(neighbor)) {
          visiting.add(neighbor);
          breadth.enqueue((T) neighbor);
        }
      }
    }
    return nodes;
  }
  public String businessTrip(T value, T [] arr) {
    int cost = 0;
    for (int i = 0; i < arr.length -1; i++) {
      if (getNeighbors(arr[i]).contains(new Node<>(arr[i+1]))) {
        cost += listOfweight.get(arr[i] + "->" + arr[i+1]);
      } else {
        return "False, $0";
      }
    }
    return true+", $" + cost ;
  }
}
