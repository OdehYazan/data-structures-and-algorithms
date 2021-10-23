package ch10.queue.structure;

import ch10.data.Node;

public class Queue {
  private Node front;
  private Node rear;

  public Queue() {
  }

  public String enqueue(String data) {

    // we add to end of the queue using the rear(last node reference)

    if (isEmpty()) {
      Node node = new Node(data);
      front = node;
      rear = node;
    } else {
      Node node = new Node(data);
      rear.setNext(node);
      rear = node;
    }
    return data;
  }

  public String dequeue() {

    // remove from the first of the queue using front
    if (isEmpty()) {
      return "Queue is empty";
    } else {
      String data = front.getData();
      front = front.getNext();
      return data;
    }
  }

  public String peek() {
    if (isEmpty()) {
      return "The Queue is empty";
    }else
    return front.getData();
  }

  public boolean isEmpty() {
    return front == null;

  }
}
