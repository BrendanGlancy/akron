import java.util.*;

public class ListTest {
  /**
   * @method main
   */
  public static void main(String[] args) {
    /**
     * @param colors
     * @type String[]
     */
    String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };

    /**
     * @param listOne
     * @type LinkedList
     * @loop foreach
     */
    List<String> listOne = new LinkedList<String>();

    for (String color : colors)
      listOne.add(color);

    /**
     * @param colorsTwo
     * @type String[]
     */
    String[] colorsTwo = { "gold", "white", "brown", "blue", "gray", "silver" };

    /**
     * @param listTwo
     * @type LinkedList
     * @loop foreach
     */
    List<String> listTwo = new LinkedList<String>();

    for (String color : colorsTwo)
      listTwo.add(color);

    /**
     * @description merge the words from listTwo to listOne
     * @method addAll
     */
    listOne.addAll(listTwo);

    /**
     * @description delete listTwo
     */
    listTwo = null;

    /**
     * @method printList
     */
    System.out.println("ListOne before converting to uppercase: ");
    printList(listOne);

    /**
     * @method convertToUppercaseString
     */
    convertToUppercaseString(listOne);

    /**
     * @method removeItems
     */
    System.out.println("ListOne after removing items 1 and 3: ");
    removeItems(listOne, 1, 3);

    /**
     * @description reverse the order of the elements in listOne
     * @method reverseList
     * @param listOne
     */
    System.out.println("listOne after reversing: ");
    reverseList(listOne);

  }

  /**
   * @method printList
   * @param list
   * @returns void
   */
  private static void printList(List<String> list) {
    /**
     * @description print list
     * @loop foreach
     */
    for (String color : list)
      System.out.printf("%s ", color);

    System.out.println('\n');
  }

  /**
   * @method convertToUppercaseString
   * @param list
   * @returns void
   */
  private static void convertToUppercaseString(List<String> list) {
    /**
     * @description convert to uppercase string
     * @loop foreach
     */
    ListIterator<String> iterator = list.listIterator();

    while (iterator.hasNext()) {
      String color = iterator.next();
      iterator.set(color.toUpperCase());
    }

    /**
     * @description print list
     * @method printList
     * @param list
     * @returns void
     */
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
     * @description remove items
     * @loop foreach
     * @method subList
     */
    list.subList(start, end).clear();

    /**
     * @description print list
     * @param list
     * @returns void
     */
    printList(list);
  }

  /**
   * @method reverseList
   * @param list
   * @returns void
   */
  private static void reverseList(List<String> list) {
    /**
     * @description reverse linked list by checking if list has a previous element
     * @loop while
     * @method hasPrevious, previous
     */
    ListIterator<String> iterator = list.listIterator(list.size());
    while (iterator.hasPrevious())
      System.out.printf("%s ", iterator.previous());
  }
}
