import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        System.out.println(length);
        String cap_1 = A.substring(0, 1).toUpperCase();
        String cap_2 = B.substring(0, 1).toUpperCase();
        int compare = A.compareTo(B);
        if (compare < 0) {
            System.out.println("No");
        } else if (compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(cap_1 + A.substring(1) + " " + cap_2 + B.substring(1));
    }
}
