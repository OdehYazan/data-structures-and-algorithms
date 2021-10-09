/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ch10;

import ch10.data.Node;
import ch10.queue.structure.Queue;
import ch10.stack.strucrure.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  void testStackPush(){
    Stack test = new Stack();
    assertEquals("Y",test.push("Y"));

  }
  @Test
  void testStack() {

    Stack stack = new Stack();
    assertEquals("The stack is empty", stack.peek());
    stack.push("Y");
    stack.push("A");

    assertEquals("Z",stack.push("Z"));
    assertEquals("Z", stack.pop());
    assertEquals("A", stack.peek());
    stack.pop();
    stack.pop();
    assertEquals("The stack is empty", stack.pop());

  }
  @Test
  void testQueue() {
    Queue queue = new Queue();
    assertEquals("The Queue is empty", queue.peek());

    assertEquals("Y", queue.enqueue("Y"));
    queue.enqueue("A");
    assertEquals("Y", queue.dequeue());
    assertEquals("A", queue.peek());
    assertEquals("A", queue.dequeue());
    assertEquals("Queue is empty", queue.dequeue());
  }

}
