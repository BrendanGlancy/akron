/**
 * Description: To demonstrate the use of an iterator
 */

import java.util.Iterator;
import java.util.ArrayList;
import java.util.function.Consumer;


public class IteratorWithArrayList {
  public static void main(String[] args){
    // Array of names
    String[] names = {"John", "Mary", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle"};

    // Create an ArrayList
    ArrayList<String> list = new ArrayList<>();

    // Add elements to the list using a foreach loop
    for (String name : names) {
      list.add(name);
    }

    /**
     * Define an action for the elements in the list
     * This action will print the elements in the list
     * The action is defined using a lambda expression
     */
    Consumer<String> action = x -> System.out.println("%s%n", x);

    // Get the iterator for the list
    // The iterator is used to traverse the list
    Iterator<String> iterator = list.iterator();

    /**
     * Traverse the list using the iterator
     * The hasNext() method returns true if there is a next element
     * The next() method returns the next element
     * The forEachRemaining() method traverses the remaining elements
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
