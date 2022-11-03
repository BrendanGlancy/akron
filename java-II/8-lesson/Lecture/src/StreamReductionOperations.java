import java.util.Arrays;
import java.util.stream.Stream;

public class StreamReductionOperations {
  /**
   * @param args
   */
  public static void main(String[] args) {
    String[] words = {"Larry", "Moe", "Curly"};

    System.out.printf("The Stream source is the array: %s %n ", Arrays.toString(words));

    Stream<String> stooges;

    // Count the number of words in the stream
    stooges = Stream.of(words);
    System.out.println("The number of words in the stream is: " + stooges.count());

    // use reduce to concatenate the words in the stream
    stooges = Stream.of(words);
    System.out.println("The concatenated words in the stream are: " + stooges.reduce("", (a, b) -> a + b));

    System.out.println("The stream reduced to an Array (2 ways):");

    // Reduce the stream to an array
    stooges = Stream.of(words);
    String[] stoogesArray = stooges.toArray(String[]::new);
    System.out.println(Arrays.toString(stoogesArray));

    /**
     * Reduce the stream to an array
     * The only difference is the argument to toArray() is a lambda expression
     * that creates an array of the desired type.
     */
    stooges = Stream.of(words);
    String[] stoogesArray2 = stooges.toArray(size -> new String[size]);
    System.out.println(Arrays.toString(stoogesArray2));
  } 
}
