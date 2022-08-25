import java.io.*;

/*
 * Filename: SerializeObject.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  deserialize an object to read a file called object.dat
 */

public class DeserializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double balanace;
        final int NUM_ACCOUNTS = 3;

        // Create the stream object to read the file
        FileInputStream fis = new FileInputStream("object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Create a new array of accounts
        BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];

        // Read the object from the file
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = (BankAccount)ois.readObject();
        }

        // close the stream
        ois.close();

        // Display the amounts in each account
        // Format the output as currency $###.##
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + (i + 1) + ": $" + accounts[i].getBalance());
        }
    }
}
