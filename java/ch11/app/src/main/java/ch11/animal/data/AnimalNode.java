package ch11.animal.data;

import ch11.data.Node;

public class AnimalNode {
  Object data;
  AnimalNode next;

  public AnimalNode(Object data) {
    this.data = data;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public AnimalNode getNext() {
    return next;
  }

  public void setNext(AnimalNode next) {
    this.next = next;
  }
}
