import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder A_reverse = new StringBuilder();
        A_reverse.append(A);
        String a_reversed = A_reverse.reverse().toString();

        if (a_reversed.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
