import java.util.*;

public class ListTest {

  /**
   * @method main
   */
  public static void main(String[] args) {

    String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
    String[] colorsTwo = { "gold", "white", "brown", "blue", "gray", "silver" };

    /**
     * @type LinkedList
     * @description A linkedlist is a collection of nodes each at a different
     *              memory location. Each node contains a reference to the next
     *              node in the list. The first node is called the head and the
     *              last node is called the tail. The tail node points to null.
     *
     *              The linkedlist is a dynamic data structure. It can grow and
     *              shrink as needed. The linkedlist is not synchronized. It is
     *              not thread safe.
     *
     *              The linkedlist is a good choice when you need to add or
     *              remove elements from the beginning or middle of the list.
     */
    List<String> listOne = new LinkedList<String>();
    List<String> listTwo = new LinkedList<String>();

    /**
     * @method add
     * @purpose demonstrate adding items to a LinkedList
     *
     * @method addAll
     * @purpose demonstrate adding all items from one collection to another
     */
    for (String color : colors)
      listOne.add(color);

    for (String color : colorsTwo)
      listTwo.add(color);

    listOne.addAll(listTwo);
    listTwo = null;

    /**
     * @purpose Output
     *
     * @function printList
     * @param list
     *
     * @function removeItems
     * @param list index start, index end
     *
     * @function reverseList
     * @param list
     */
    System.out.println("ListOne before converting to uppercase: ");
    printList(listOne);

    convertToUppercaseString(listOne);

    System.out.println("ListOne after removing items 1 and 3: ");
    removeItems(listOne, 1, 3);

    System.out.println("listOne after reversing: ");
    reverseList(listOne);
  }

  /**
   * @method printList
   * @param list
   * @return void
   */
  private static void printList(List<String> list) {
    for (String color : list)
      System.out.printf("%s ", color);

    System.out.println('\n');
  }

  /**
   * @method {convertToUppercaseString}
   * @param list
   * @return void
   */
  private static void convertToUppercaseString(List<String> list) {
    ListIterator<String> iterator = list.listIterator();

    /**
     * @method hasNext
     * @return boolean
     *
     * @method next
     * @return String
     *
     * @method set
     * @param String
     * @return void
     */
    while (iterator.hasNext()) {
      String color = iterator.next();
      iterator.set(color.toUpperCase());
    }

    System.out.println("ListOne after converting to uppercase: ");
    printList(list);
  }

  /**
   * @method removeItems
   * @param list
   * @param start
   * @param end
   * @returns void
   */
  private static void removeItems(List<String> list, int start, int end) {
    /**
     * @method subList
     * @purpose returns a view of the portion of this list between the specified
     *          fromIndex, inclusive, and toIndex, exclusive.
     */
    list.subList(start, end).clear();
    printList(list);
  }

  /**
   * @method reverseList
   * @param list
   * @returns void
   */
  private static void reverseList(List<String> list) {
    ListIterator<String> iterator = list.listIterator(list.size());

    /**
     * @method hasPrevious
     * @returns boolean
     * @purpose returns true if the list iterator has more elements when
     *          traversing the list in the reverse direction
     *
     * @method previous
     * @returns String
     * @purpose returns the previous element in the list and moves the cursor
     *          position backwards
     */
    while (iterator.hasPrevious())
      System.out.printf("%s ", iterator.previous());
  }
}
