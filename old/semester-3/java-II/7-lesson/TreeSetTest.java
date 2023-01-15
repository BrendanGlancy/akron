import java.util.*;

public class TreeSetTest {
  /**
   * @param args
   * @main
   */
  public static void main(String[] args) {
    /*
     * @type treeSet
     * The TreeSet class implements the Set interface, backed by a tree.
     * It guarantees that the elements are sorted in ascending order.
     * It is not synchronized.
     *
     * TreeSet is a good choice when you need to store a large number of
     * sorted elements and you don't need to access them randomly.
     * It is also a good choice when you need to access the elements in
     * ascending order.
     *
     * TreeSet is one of the most import implementations of the SortedSet interface.
     */

    SortedSet<String> treeSet = new TreeSet<String>();
    treeSet.add("A");
    treeSet.add("B");
    treeSet.add("C");
    treeSet.add("D");
    treeSet.add("E");

    System.out.println("TreeSet: " + treeSet);

    treeSet.add("BlueBerry");
    treeSet.add("Apple");
    treeSet.add("Orange");

    System.out.println("TreeSet: " + treeSet);

    System.out.println("First: " + treeSet.first());
    System.out.println("Last: " + treeSet.last());

    System.out.println("HeadSet: " + treeSet.headSet("Orange"));
    System.out.println("TailSet: " + treeSet.tailSet("Orange"));
  }
}
