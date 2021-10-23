package structure;

import data.QueueNode;

public class Queue<T> {
  private QueueNode<T> front;
  private QueueNode<T> rear;

  public Queue() {
  }

  public T enqueue(T data) {

    // we add to end of the queue using the rear(last node reference)

    if (isEmpty()) {
      QueueNode<T> node = new QueueNode<>(data);
      front = node;
      rear = node;
    } else {
      QueueNode<T> node = new QueueNode<>(data);
      rear.setNext(node);
      rear = node;
    }
    return data;
  }

  public T dequeue() {

    // remove from the first of the queue using front
    if (isEmpty()) {
      return (T) "Queue is empty";
    } else {
      T data = front.getData();
      front = front.getNext();
      return data;
    }
  }

  public T peek() {
    if (isEmpty()) {
      return (T)"The Queue is empty";
    } else
      return front.getData();
  }

  public boolean isEmpty() {
    return front == null;

  }
}
