/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ch5;

import ch5.structure.LinkedList;

public class Main {

  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();

    linkedList.insert("Y");
    System.out.println(linkedList.stringOutput());
    linkedList.insert("A");
    linkedList.insert("Z");
    linkedList.insert("A");
    linkedList.insert("N");

    System.out.println(linkedList.stringOutput());

    System.out.println("******** "+linkedList.includes("A")+" **********");
  }

}

