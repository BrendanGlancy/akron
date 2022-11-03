import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReductionToMapDemo {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Stream<String> names = Stream.of("John", "Paul", "George", "Ringo");
    Function<String, Integer> keyMapper = x -> x.length();

    /**
     * Function takes a string and returns a list of strings
     */
    Function<String, List<String>> valueMapper = x -> {
      List<String> list = new ArrayList<>();
      list.add(x);
      return list;
    };

    /**
     * BinaryOperator takes two lists of strings and returns a list of strings
     */
    BinaryOperator<List<String>> mergeFunction =
        (list1, list2) ->
        {
          list1.addAll(list2);
          return list1;
        };


    /**
     * Collect the stream into a map
     */
    Map<Integer, List<String>> map = 
      names.collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction));
    System.out.printf("map = %s%n", map);
  } 

}
