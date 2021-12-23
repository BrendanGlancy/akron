import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner input = new Scanner(System.in);
        String str = input.next();
        /*
         * Enter your code here. Print output to STDOUT.
         * Works for both MD5 and SHA-256 problems
         */
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(str.getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
        input.close();

    }
}
