import java.io.*;
import java.util.Scanner;

/*
 * Filename: SerializeObject.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  Serialize an object to a file
 */

public class SerializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // init the scanner
        Scanner input = new Scanner(System.in);

        // Create a double called balance
        double balance;
        // Create a final int called NUMITEMS set it to 3
        final int NUMITEMS = 3;

        // Create a new bank account object
        BankAccount[] account = new BankAccount[NUMITEMS];

        // Populate the array
        for (int i = 0; i < account.length; i++) {
            // Get the account balances
            System.out.println("Enter the account balance " + (i + 1) + ": ");
            balance = input.nextDouble();

            // enter the data into the array
            account[i] = new BankAccount(balance);
        }

        // Create the stream objects
        FileOutputStream fout = new FileOutputStream("object.dat");
        ObjectOutputStream oout = new ObjectOutputStream(fout);

        // Write the serialized object to the file
        for (int i = 0; i < account.length; i++) {
            oout.writeObject(account[i]);
        }

        // Close the scanner
        // Close the stream
        input.close();
        oout.close();

        // Display a message to let the user know the program has finished
        System.out.println("Serialization complete");
    }
}
