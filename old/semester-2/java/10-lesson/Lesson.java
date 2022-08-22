public class Lesson {
  public static void main(String[] args) {
    // declare an array
    String[] words = {"Hello", "World", "!"};

    // print the array
    for (String word : words) {
      // if were not at the last element
      if (word != words[words.length - 1]) {
        System.out.print(word + " ");
      } else {
        System.out.print(word + "\n");
      }
    }
  }
}


