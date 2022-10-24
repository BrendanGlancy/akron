
/**
 * Description: To demonstrate the use of an iterator
 */

import java.util.Iterator;
import java.util.ArrayList;
import java.util.function.Consumer;

public class IteratorWithArrayList {
  public static void main(String[] args) {
    /**
     * @param names
     * @type String[]
     *
     * @param list
     * @type ArrayList<String>
     */

    String[] names = { "John", "Mary", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle" };
    ArrayList<String> list = new ArrayList<>();

    /**
     * The for-each loop is used to iterate through the elements of an
     * ArrayList. The syntax is:
     *
     * for (type var : collection) {
     * // statements
     * }
     */
    for (String name : names) {
      list.add(name);
    }

    /**
     * @param action
     * @type Consumer<String>
     * @function forEach lambda expression
     */
    Consumer<String> action = x -> System.out.println("%s%n", x);

    /*
     * @param iterator
     *
     * @type Iterator<String>
     */
    Iterator<String> iterator = list.iterator();

    /**
     * @param hasNext
     * @type boolean
     * @function hasNext() method
     *
     * @param name
     * @type String
     *
     * @condition if hasNext() is true, then print the next element
     */
    while (iterator.hasNext()) {
      String name = iterator.next();
      System.out.println(name);
      if (name.equals("Peter")) {
        iterator.forEachRemaining(action);
      }
    }
  }
}
