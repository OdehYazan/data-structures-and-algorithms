package ch11;

import ch11.stack.strucrure.Stack;

public class PseudoQueue {

    private Stack Stack1;
    private Stack Stack2;


    public PseudoQueue(){
      this.Stack1 = new Stack();
      this.Stack2 = new Stack();
    }
    public void enqueue(String value) {
      if (Stack1.peek() == null) {
        Stack1.push(value);
      } else {
        while (Stack1.peek() != null) {
          Stack2.push(Stack1.pop());
        }
        Stack1.push(value);
        while (Stack2.peek() != null) {
          Stack1.push(Stack2.pop());
        }
      }
    }
    public String dequeue() {
      return Stack1.peek() == null ? null : Stack1.pop();
    }
}
