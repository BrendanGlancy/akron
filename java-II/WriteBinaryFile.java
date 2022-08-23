/*
 * Filename: WriteBinaryFile.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  Write a binary file
 */

import java.io.*;


public class WriteBinaryFile {
    public static void main(String[] args) throws IOException {
        // Create an array and write that array to a binary file
        int[] array = {1, 2, 3, 4, 5};

        // Create the binary output objects
        // Check to see that the file exists
        FileOutputStream fos = new FileOutputStream("binary.dat");
        DataOutputStream outputFile = new DataOutputStream(fos);


        System.out.println("Writing to binary file");

        // Write the array to the binary file
        for (int i = 0; i < array.length; i++) {
            outputFile.writeInt(array[i]);
        }

        System.out.println("Done writing to binary file");

        outputFile.close();
    }
}
