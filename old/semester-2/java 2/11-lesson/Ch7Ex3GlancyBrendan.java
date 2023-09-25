import java.util.*;

/*
 * Author: Brendan Glancy
 * Date: 04/12/2022
 */

class Ch7Ex3GlancyBrendan {
  public static void main(String[] args) {
    // Driver code
    // ask the user to enter a charge account number
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    System.out.print("Enter a charge account number: ");

    int accountNumber = input.nextInt();
    System.out.println("Would you like to use sequential search (1) or binary search (2)?: ");
    String searchType = input2.nextLine();

    // Convert the search type to lower case
    searchType = searchType.toLowerCase();

    // using the CheckChargeAccount class, check the account number
    CheckChargeAccount checkAccount = new CheckChargeAccount();

    // Check how long seq took
    long startSeq = System.nanoTime();
    checkAccount.checkChargeAccount(accountNumber, "1");
    long stopSeq = System.nanoTime();

    // Check how long bin took
    long startBin = System.nanoTime();
    checkAccount.checkChargeAccount(accountNumber, "2");
    long stopBin = System.nanoTime();

    boolean isValid = checkAccount.checkChargeAccount(accountNumber, searchType);

    String seqTime = String.valueOf(stopSeq - startSeq);
    String binTime = String.valueOf(stopBin - startBin);

    System.out.println("Sequence sort time: " + seqTime);
    System.out.println("Binary sort time: " + binTime);

    if ((stopSeq - startSeq) < (stopBin - startBin)) {
      System.out.println("Sequential sort was faster");
    } else if ((stopSeq - startSeq) > (stopBin - startBin)) {
      System.out.println("Binary sort was faster");
    } else {
      System.out.println("Both sorts were the same");
    }

    // Print out if the number is valid or not
    System.out.println("The account number is " + (isValid ? "valid" : "invalid"));

    input.close();
    input2.close();
  }
}

/*
 * Desc:
 * Create a class with a method that accepts a charge account number as its argument
 * The method should determine whether the number is valid by comparing it to the following list of valid charge accound numbers:
 * 5658845 4520125 7895122 8777541 1302850 8080152 4562555 5552012 5050552 7825877 1250255 1005231 6545231 3852085 7576651 7881200 4851002
 *
 * These numbers should be stored in an ArrayList object. Use sequential search to locate the number passed as an argument.
 * If the number is in the array the method should return true, indicating the number is valid.
 * If the number is NOT in the array the method should return false.
 *
 * Write a program to test the class by asking the user ot enter a charge account number. The program should display a message indicating whether the number is valid or invalid
 *
 * Bonus: I thought it would be cool to see which search method was faster.
 */

class CheckChargeAccount {
  public boolean checkChargeAccount(int accountNumber, String searchType) {
    // Create an array list of valid charge account numbers
    ArrayList<Integer> validAccountNumbers = new ArrayList<Integer>();
    validAccountNumbers.add(5658845);
    validAccountNumbers.add(4520125);
    validAccountNumbers.add(7895122);
    validAccountNumbers.add(8777541);
    validAccountNumbers.add(1302850);
    validAccountNumbers.add(8080152);
    validAccountNumbers.add(4562555);
    validAccountNumbers.add(5552012);
    validAccountNumbers.add(5050552);
    validAccountNumbers.add(7825877);
    validAccountNumbers.add(1250255);
    validAccountNumbers.add(1005231);
    validAccountNumbers.add(6545231);
    validAccountNumbers.add(3852085);
    validAccountNumbers.add(7576651);
    validAccountNumbers.add(7881200);
    validAccountNumbers.add(4851002);

    // Use sequential search to locate the number passed as an argument
    // If the number is in the array the method should return true, indicating the number is valid
    // If the number is NOT in the array the method should return false
    if (searchType.equals("1")) {
      // call the sequential search method
      boolean isValid = sequentialSearch(accountNumber, validAccountNumbers);
      return isValid;
    } else if (searchType.equals("2")) {
      // convert the array list to an List<Integer>
      List<Integer> list = validAccountNumbers;
      // call the binary search method
      boolean isValid = binarySearch(accountNumber, list);
      return isValid;
    } else {
      System.out.println("Invalid search type");
      return false;
    }
  }

  public static boolean sequentialSearch(int accountNumber, ArrayList<Integer> validAccountNumbers) {
    // Create a boolean variable to store the result
    boolean isValid = false;

    // Loop through the array list
    for (int i = 0; i < validAccountNumbers.size(); i++) {
      // If the number is found, set the boolean variable to true
      if (accountNumber == validAccountNumbers.get(i)) {
        isValid = true;
      }
    }

    // Return the boolean variable
    return isValid;
  }

  public static boolean binarySearch(int accountNumber, List<Integer> validAccountNumbers) {
    // Create a boolean variable to store the result
    boolean isValid = false;
    int l = 0, r = validAccountNumbers.size() - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;
      if (accountNumber == validAccountNumbers.get(m)) {
        isValid = true;
        break;
      } else if (accountNumber < validAccountNumbers.get(m)) {
        r = m - 1;
      } else {
        l = m + 1;
      }
    }
    return isValid;
  }
}
