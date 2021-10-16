package ch11.stack.strucrure;

import ch11.data.Node;
import ch11.stack.data.StackNode;


public class Stack<T> {

  private Node<T> top;

  public Stack() {
  }

  public T push(T data) {

    // PUSH (add) use top stack as reference

    if (isEmpty()) {
      Node<T> node = new StackNode<>(data);
      top = node;
    } else {
      Node<T> node = new StackNode<>(data);
      node.setNext(top);
      top = node;
    }
    return data;
  }

  public T pop() {

    // POP (remove) using stack top reference

    if (isEmpty()) {
      return (T)"The stack is empty";
    } else {
      T data = top.getData();
      top = top.getNext();
      return data;
    }
  }

  public T peek() {

    //PEEK look to the top node of the stack
    if (isEmpty()) {
      return (T)"The stack is empty";
    } else {
      return top.getData();
    }
  }

  public boolean isEmpty() {
    return top == null;
  }


}
