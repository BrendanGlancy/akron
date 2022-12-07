/**
 * Name: Brendan Glancy
 * Chapter: 18, Programming Challenge 7 Word Frequency Count
 *
 * Description: 
 *  Write a program that allows the userd to specify a text file, 
 *  opens the file, and reads its contents.
 *
 *  The program should then print a two-column table 
 *  consisting of all the words in the file together with the 
 *  number of times each word occurs in the file. 
 *
 *  Words should be space-delimited and case-sensitive. The table should list the words 
 *  in alphabetical order.
 */

import java.io.*;
import java.util.*;

public class WordFrequencyCount {
  public static void main(String[] args) {
    /**
     * Prompt the user for the name of a file.
     */
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the name of a file: ");

    /**
     * Open the file and read its contents.
     */
    try {
      File file = new File(keyboard.nextLine());
      Scanner inputFile = new Scanner(file);

      /**
       * Create a TreeMap to hold the words as keys and their frequencies as values.
       */
      TreeMap<String, Integer> wordMap = new TreeMap<String, Integer>();

      /**
       * Read the words from the file and store them in the TreeMap.
       */
      while (inputFile.hasNext()) {
        String word = inputFile.next();
        if (wordMap.containsKey(word)) {
          int count = wordMap.get(word);
          wordMap.put(word, count + 1);
        } else {
          wordMap.put(word, 1);
        }
      }

      /**
       * Close the file.
       */
      inputFile.close();

      /**
       * Display the words and frequencies in the TreeMap.
       */
      System.out.println("Word\t\tFrequency");
      System.out.println("------------------------");
      for (String word : wordMap.keySet()) {
        System.out.println(word + "\t\t" + wordMap.get(word));
      }
  } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
  }
}
