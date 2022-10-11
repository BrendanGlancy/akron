import java.util.ArrayList;

/**
 * Description: To demonstrate the use of the for-each loop with an ArrayList
 */

public class ForEachWithArrayList {
  public static void main(String[] args) {
    // Array of Names
    String[] names = {"John", "Mary", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle"};

    // Create an ArrayList of Strings
    ArrayList<String> namesArrayList = new ArrayList<String>();

    /**
     * The for-each loop is used to iterate through the elements of an
     * ArrayList. The syntax is:
     *
     * for (type var : collection) {
     *  // statements
     *  }
     */
    for (String name : names) {
      namesArrayList.add(name);
    }

    /**
     * Lambda expression is used to iterate through the elements of an
     * ArrayList. The syntax is:
     *
     * names.forEach(name -> {
     * // statements
     * });
     */

    namesArrayList.forEach(name -> {
      // namesArrayList.indexOf(name) returns the index of the element
      System.out.println(namesArrayList.indexOf(name) + ": " + name);
    });
  }
}
