/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ch5;


import ch5.structure.LinkedList;

public class Main {

  public static void main(String[] args) {
      LinkedList fun = new LinkedList();

    LinkedList linkedList1 = new LinkedList();

    linkedList1.add("Y");
    linkedList1.add("A");
    linkedList1.add("Z");
    linkedList1.add("A");
    linkedList1.add("N");
//    linkedList1.append("Z");
    linkedList1.insertBefore("N","K");
//    linkedList1.insertAfter("Q","X");

    LinkedList linkedList2 = new LinkedList();
    linkedList2.insert("Y");
    linkedList2.insert("A");
    linkedList2.insert("Z");
    linkedList2.insert("A");
    linkedList2.insert("N");


    System.out.println(linkedList1.stringOutput());



    System.out.println(linkedList2.stringOutput());


    System.out.println(fun.stringOutput());
  }


}

