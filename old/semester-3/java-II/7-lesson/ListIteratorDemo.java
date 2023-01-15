import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {
  public static void main(String[] args) {

    /**
     * @param list
     * @type ArrayList
     * @param iterator
     * @type Iterator
     *
     * @description
     *              1. Create a list of type ArrayList
     *              2. Add elements to the list
     *              3. Create an iterator for the list
     */

    ArrayList<String> list = new ArrayList<String>();
    list.add("Chris");
    list.add("John");
    list.add("Mary");
    list.add("Peter");
    list.add("Susan");

    System.out.println("Here are the names in the original list: ");
    System.out.println(list);

    ListIterator<String> iterator = list.listIterator();

    /**
     * @description
     *              1. Use the hasNext() method to check if there is a next element
     *              2. Use the next() method to get the next element
     *              3. if the element is "Mary", replace it with "Marry" using the
     *              set() method
     *
     * @condition if
     * @loop while
     */
    while (iterator.hasNext()) {
      String name = iterator.next();
      if (name.equals("Mary")) {
        iterator.set("Marry");
        break;
      }
    }

    System.out.println("Here are the names in the modified list: ");
    System.out.println(list);
  }
}
