// in class programming excercises

/********************************************************
 *
 * Decision Structures and Loops
 *  What was covered in class:
 *  - ++ increment
 *    - ++i post increment
 *    - i++ pre increment
 *  - -- decrement
 *    - --i post decrement
 *    - i-- pre decrement
 *
 *  What actually exists
 *  - += addition
 *  - -= subtraction
 *  - *= multiplication
 *  - /= division
 *  - %= modulus
 *  - <<= left shift
 *  - >>= right shift
 *  - >>>= unsigned right shift
 *  - &= bitwise and
 *  - ^= bitwise xor
 *  - |= bitwise or
 *  - && logical and
 *  - || logical or
 *  - ! logical not
 *  - < less than
 *  - > greater than
 *  - <= less than or equal to
 *  - >= greater than or equal to
 *  - == equal to
 *  - != not equal to
 *  - === equal to
 *  - !== not equal to
 *  - <=> compare
 *  - ?: ternary operator
 *
 * - for loop
 *   - for (initialization; condition; update)
 *   - for (int i = 0; i < 10; i++)
 *
 * - Nested for loop
 *   - for (int i = 0; i < 10; i++)
 *      for (int j = 0; j < 10; j++)
 *
 * - while loop
 *   - while (condition)
 *
 * - do while loop
 *   - do {
 *   // code to be executed
 *   } while (condition);
 *
 * - Conditional Statements
 *   - if (condition)
 *   - if (condition) {
 *   // code to be executed
 *   }
 *   - else if (condition)
 *   - else if (condition) {
 *   // code to be executed
 *   }
 *   - else
 *   - else {
 *   // code to be executed
 *   }
 *   - switch (expression) {
 *   case constant:
 *   // code to be executed
 *   break;
 *   case constant:
 *   // code to be executed
 *   break;
 *   default:
 *   // code to be executed
 *   break;
 *   }
 *
 *   - try {handler
 *   // code to be executed
 *   } catch (Exception e) {
 *   // code to be executed
 *   } finally {
 *   // code to be executed
 *   }
 *
 *
 ********************************************************/

public class Solution {
    public static void main(String[] args) {

        // for loop to print out the numbers from 1 to 10
        // Pretest loop
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Pretest loop for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------");

        // while loop to print out the numbers from 1 to 10
        // Pretest loop
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Pretest loop while loop");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
        System.out.println("-------------------");

        // do while loop to print out the numbers from 1 to 10
        // this loop will run at least once
        // Posttest loop
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Post-test do while loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
        System.out.println("-------------------");

        System.out.println();
        System.out.println("-------------------");
        System.out.println("For each loop example");
        // for each loop to print variables from an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : array) {
            System.out.println(num);
        }
        System.out.println("-------------------");

        System.out.println();
        System.out.println("-------------------");
        System.out.println("For loop with conditional to print prime numbers");
        // loop to print out prime numbers from 1 to 100
        // prime numbers are numbers that are divisible by 1 and itself
        for (int num = 1; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                // if number isn't divisible by any number less than itself
                if (num % i == 0) {
                    // set isPrime to false
                    isPrime = false;
                    break;
                }
            }
            // Conditional statement to print out prime numbers
            if (isPrime) {
                System.out.println(num);
            }
        }
        System.out.println("-------------------");

        // example of a ternary operator
        // if condition is true, print out "true"
        // if condition is false, print out "false"
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Ternary operator example");
        boolean condition = true;
        System.out.println(condition ? "true" : "false");
        System.out.println("-------------------");

        // example of a switch statement
        // switch statement is used to compare a value to a set of values
        // if the value matches a value in the set, the code block associated with that value is executed
        // if the value does not match any value in the set, the code block associated with the default value is executed
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Switch statement example");
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("one");
                break;

            default:
                break;
        }
        System.out.println("-------------------");

        System.out.println();
        System.out.println("-------------------");
        System.out.println("Try catch example");
        // example of a try catch statement
        // null object reference exception
        final Object obj = null;
        try {
            // code to be executed
            // if an exception is thrown, the catch block is executed
            obj.toString();
        } catch (Exception e) {
            // code to be executed
            // if an exception is thrown, the catch block is executed
            e.printStackTrace();
        } finally {
            // code to be executed
            // if an exception is thrown, the finally block is executed
            System.out.println("finally");
        }
        System.out.println("-------------------");

        System.out.println();
        System.out.println("-------------------");
        System.out.println("Nested loop example");
        // nested loop example
        // loops 100 times | 10 * 10
        for (int i = 0; i < 10; i++) {
            for (int s = 0; s < 10; s++) {
                System.out.println(i + " " + s);
            }
        }
        System.out.println("-------------------");
    }
}
