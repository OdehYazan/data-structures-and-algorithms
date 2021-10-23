package ch10.stack.strucrure;

import ch10.data.Node;
import ch10.stack.data.StackNode;


public class Stack {

  private Node top;

  public Stack() {
  }

  public String push(String data) {

    // PUSH (add) use top stack as reference

    if (isEmpty()) {
      Node node = new StackNode(data);
      top = node;
    } else {
      Node node = new StackNode(data);
      node.setNext(top);
      top = node;
    }
    return data;
  }

  public String pop() {

    // POP (remove) using stack top reference

    if (isEmpty()) {
      return "The stack is empty";
    } else {
      String data = top.getData();
      top = top.getNext();
      return data;
    }
  }

  public String peek() {

    //PEEK look to the top node of the stack
    if (isEmpty()) {
      return "The stack is empty";
    } else {
      return top.getData();
    }
  }

  public boolean isEmpty() {
    return top == null;
  }
}
