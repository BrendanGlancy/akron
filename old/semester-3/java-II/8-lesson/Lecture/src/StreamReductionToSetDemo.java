import java.util.stream.Stream;
import java.util.Set;
import java.util.HashSet;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


public class StreamReductionToSetDemo {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

    /**
     * BiFunction<T,U,R> is a functional interface 
     * that represents a function that accepts two arguments and produces a result.
     * It is the two-arity specialization of Function.
     * BiFunction<T,U,R> is the two-arity specialization of Function.
     */
    BiFunction<Set<String>, String, Set<String>> accumulator = (set, item) -> {
      set.add(item);
      return set;
    };

    /**
     * BinaryOperator<T> is a functional interface 
     * that represents an operation upon two operands of the same type, 
     * producing a result of the same type as the operands.
     * BinaryOperator is a specialization of BiFunction for the case 
     * where the operands and the result are all of the same type.
     */
    BinaryOperator<Set<String>> combiner = (set1, set2) -> {
      set1.addAll(set2);
      return set1;
    };

    Set<String> set = stream.reduce(new HashSet<String>(), accumulator, combiner);
    System.out.printf("set = %s%n", set);
  }
}
