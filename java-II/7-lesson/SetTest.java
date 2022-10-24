
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class SetTest {

  /**
   * @function: main
   * @param args
   */
  public static void main(String[] args) {
    String[] colors = { "red", "white", "blue", "green", "gray", "orange",
        "tan", "white", "cyan", "peach", "gray", "orange" };
    List<String> list = Arrays.asList(colors);

    /**
     * @functionCall: printNonDuplicate
     */
    printNonDuplicates(list);
  }

  /**
   * @function: printNonDuplicates
   * @param values
   */
  private static void printNonDuplicates(Collection<String> values) {
    /**
     * @type : hashSet
     * @description: hashSet is a set that uses a hash table for storage.
     *               It makes no guarantees as to the iteration order of the set;
     *               in particular, it does not guarantee that the order will
     *               remain constant over time.
     *               A HashSet is a collection that cannot contain duplicate
     *               elements.
     *
     * @param: values
     */
    Set<String> set = new HashSet<String>(values);

    System.out.printf("Nonduplicates are: ");

    set.add("strawberry");
    for (String value : set)
      System.out.printf("%s ", value);
    System.out.println();

  }
}
