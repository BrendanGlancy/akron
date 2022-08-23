/*
 * Filename: WriteBinaryFile.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  Write a binary file
 */

import java.io.*;

public class ReadBinaryFile {
    public static void main(String[] args) throws IOException {

        // Create and end of file bool
        boolean eof = false;

        // Create a num variable to hold the number of bytes read
        int num;


        // Create the binary file input objects
        FileInputStream fstream = new FileInputStream("binary.dat");
        DataInputStream inputStream = new DataInputStream(fstream);

        System.out.println("Reading binary file");

        while (!eof) {
            try {
                num = inputStream.readInt();
                System.out.println(num + " ");
            } catch (EOFException e) {
                eof = true;
            }

        }

        inputStream.close();
        System.out.println("End of file");
    }
}
