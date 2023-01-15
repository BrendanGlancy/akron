/**
 * Name: Brendan Glancy
 * Date: 12/7/2022
 * Description: Write an application that reads a line of input from the keyboard,
 *             and then displays each unique word taht was entered, sorted in ascending order.
 *             You can do this by tokenizing the line of input into words , and adding each token 
 *             to an appropiate Set object
 */

import java.util.*;
import java.io.*;

public class WordSet {
  public static void main(String[] args) {
    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Create a Set object to hold the words.
    Set<String> words = new TreeSet<String>();

    // Get a line of input from the user.
    System.out.print("Enter a line of text: ");
    String input = keyboard.nextLine();

    // convert the input to lowercase.
    input = input.toLowerCase();

    // replace all non-alphabetic characters with spaces
    input = input.replaceAll("[^a-zA-Z]", " ");

    // Tokenize the input.
    StringTokenizer tokenizer = new StringTokenizer(input);

    // Add each token to the Set.
    while (tokenizer.hasMoreTokens()) {
      words.add(tokenizer.nextToken());
    }

    // Display the words.
    System.out.println("The unique words are: ");
    for (String word : words) {
      System.out.println(word);
    }
  }
}
