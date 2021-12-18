import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* Enter your code here. Print output to STDOUT. */
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.updatei(input.NextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("02x", i));
        }
        System.out.println();


    }
}

