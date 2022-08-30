/*
 * Desc: Example code of an unsafe arraylist
 */

import java.util.ArrayList;

public class UnsafeArrayList {
  public static void main(String[] args) {

    // Create an unsafe arraylist
    ArrayList<String> unsafeList = new ArrayList<String>();
    unsafeList.add("Hello");
    unsafeList.add("World");
    unsafeList.add("!");

    // create an arraylist of size 10
    ArrayList<String> list = new ArrayList<String>(10);

    // add elements to the arraylist
    list.add(0, "a");
    list.add(1, "b");

  }
}
