/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ch5;

import ch5.structure.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  @Test
  public void testAppend() {
    LinkedList linkedList1 = new LinkedList();

    linkedList1.add("Y");
    linkedList1.add("A");
    linkedList1.add("Z");
    linkedList1.add("A");
    linkedList1.add("N");
    linkedList1.append("O");
    linkedList1.append("D");


    assertEquals("HEAD -> {Y} -> {A} -> {Z} -> {A} -> {N} -> {O} -> {D} -> NULL",linkedList1.stringOutput());

  }
  @Test
  public void testInsertBefore() {
    LinkedList linkedList1 = new LinkedList();

    linkedList1.add("Y");
    linkedList1.add("A");
    linkedList1.add("Z");
    linkedList1.add("A");
    linkedList1.add("N");
    linkedList1.insertBefore("N", "K");
    assertEquals("HEAD -> {Y} -> {A} -> {Z} -> {A} -> {K} -> {N} -> NULL", linkedList1.stringOutput());

  }
  @Test
  public void testInsertAfter() {
    LinkedList linkedList1 = new LinkedList();

    linkedList1.add("Y");
    linkedList1.add("A");
    linkedList1.add("Z");
    linkedList1.add("A");
    linkedList1.add("N");
    linkedList1.insertAfter("Z", "K");
    assertEquals("HEAD -> {Y} -> {A} -> {Z} -> {K} -> {A} -> {N} -> NULL", linkedList1.stringOutput());
    linkedList1.insertAfter("N", "N");
    assertEquals("HEAD -> {Y} -> {A} -> {Z} -> {K} -> {A} -> {N} -> {N} -> NULL", linkedList1.stringOutput());


  }
  }
