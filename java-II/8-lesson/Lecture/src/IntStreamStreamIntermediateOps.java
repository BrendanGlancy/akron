import java.util.stream.IntStream;

public class IntStreamStreamIntermediateOps {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    IntStream is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    is.filter(i -> i % 2 == 0).forEach(System.out::println);
    System.out.println("");

    is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    is.map(i -> i * i).forEach(System.out::println);
    System.out.println("");

    is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    is.limit(5).forEach(System.out::println);
    System.out.println("");
  }
}
