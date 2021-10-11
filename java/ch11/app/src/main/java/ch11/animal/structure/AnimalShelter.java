package ch11.animal.structure;


import ch11.animal.data.AnimalNode;

public class AnimalShelter {
  // Instance properties
  private AnimalNode front;
  private AnimalNode rear;

  // Constructor
  public AnimalShelter() {
    this.front = null;
    this.rear = null;
  }

  // Adds a new node with the specified value to the back of the queue with an O(1) Time performance
  public void enqueue(Object value) {
    AnimalNode newNode = new AnimalNode(value);
    if (front == null) {
      front = newNode;
      rear = newNode;
    } else {
      rear.setNext(newNode);
      rear = newNode;
    }
  }

  // Removes the node from the front of the queue, and returns that node's value
  public Object dequeue(String animalType) {
    AnimalNode previous = front;
    AnimalNode current = front;
    if (current == null) {
      return null;
    } else {
      while (current.getData().toString() != animalType) {
        current = current.getNext();
        previous = previous.getNext().getNext();
        if (current==null){
          return null;
        }
      }
//       current.setNext(previous);
      return current.getData();

    }
  }

    public Object peek() {
      return this.front != null ? this.front.getData() : null;
    }

  }
