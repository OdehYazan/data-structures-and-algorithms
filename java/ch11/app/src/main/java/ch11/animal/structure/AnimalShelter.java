package ch11.animal.structure;


import ch11.animal.data.AnimalNode;

public class AnimalShelter {

  private AnimalNode front;
  private AnimalNode rear;


  public AnimalShelter() {
    this.front = null;
    this.rear = null;
  }


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

//  public Object dequeue(String animalType) {
//    AnimalNode previous = front;
//    AnimalNode current = front;
//    while (current != null) {
//      if (current.getData().toString() == animalType) {
//
//        if (current == previous && current.getNext() == null) {
//          front = null;
//          rear = null;
//
//        } else if (current == previous && current.getNext() != null) {
//          front = front.getNext();
//          // Points rear to the previous node if the last node is being removed
//        } else if (current == rear) {
//          rear = previous;
//        }
//        if (current != previous) {
//          previous.setNext(previous.getNext().getNext());
//        }
//        return current.getData();
//      }
//
//      if (previous != current) {
//        previous = previous.getNext();
//      }
//      current = current.getNext();
//    }
//    return null;
//  }

    public Object peek() {
      return front != null ? front.getData() : null;
    }

  }
