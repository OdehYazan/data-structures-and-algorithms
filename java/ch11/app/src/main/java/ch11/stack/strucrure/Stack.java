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

  public static boolean validateBrackets(String input) {
    Stack<Character> stack = new Stack<Character>();
    char current = '0';
    for (int i = 0; i < input.length(); i++) {
      // Saving the char that is currently being looked at for readability
      current = input.charAt(i);

      // Pushes all (, [ and { chars into the stack
      if (current == '(' ||
        current == '[' ||
        current == '{') {
        stack.push(current);
      } else if (current == ')') {
        if (stack.peek() == null || stack.pop() != '(') {
          return false;
        }
      } else if (current == ']') {
        if (stack.peek() == null || stack.pop() != '[') {
          return false;
        }
      } else if (current == '}') {
        if (stack.peek() == null || stack.pop() != '{') {
          return false;
        }
      }
    }

    // Checks to see if the stack is "empty"
//    return stack.peek() == null ? false : true;
    return true;
  }


public boolean isEmpty() {
    return top == null;
  }


}
