/*
 * Filename: WriteRandAccessFile.java
 * Author:   @author Brendan Glancy
 * Date:     @date 08/23/22
 * Purpose:  Read a Rand Access File
 */

import java.io.*;

public class ReadRandAccessFile
{
    public static void main(String[] args) throws IOException
    {
        final int CHARSIZE = 2;
        long byteNum;
        char ch;

        // open the file for reading
        RandomAccessFile raf = new RandomAccessFile("letters.dat", "r");

        // Read the first record
        ch = raf.readChar();
        System.out.println(ch);

        // Move the file pointer to character #5 or the 6th character from the beginning of the file
        byteNum = CHARSIZE * 5;
        raf.seek(byteNum);

        // Display this character
        ch = raf.readChar();
        System.out.println(ch);

        // move the file pointer to char 2
        byteNum = CHARSIZE * 2;
        raf.seek(byteNum);
        ch = raf.readChar();
        System.out.println(ch);

        // close raf
        raf.close();
    }
}
