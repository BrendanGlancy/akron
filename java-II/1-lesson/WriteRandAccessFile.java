/*
 * Filename: WriteRandAccessFile.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  Write a binary file
 */

import java.io.*;

public class WriteRandAccessFile {
    public static void main(String[] args) throws IOException {
        // create a char array of 10 chars
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        // open a random access file
        System.out.println("Opening file...");
        // rw means read and write
        RandomAccessFile raf = new RandomAccessFile("letters.dat", "rw");

        // write the letters to the file
        for (int i = 0; i < letters.length; i++) {
            raf.writeChar(letters[i]);
        }

        raf.close();
    }
}
