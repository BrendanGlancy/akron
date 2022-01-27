import java.util.Scanner;

/*****
 * Name: Brendan Glancy
 * Date: 1/28/2022
 * Description: Program calculates miles per gallon based on user input
 * Input: miles driven, gallons used
 * Output: miles per gallon
 *****/

public class Solution {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt user for miles driven
        System.out.print("Enter miles driven: ");
        int n = in.nextInt();

        // Prompt user for gallons used
        System.out.print("Enter gallons used: ");
        int m = in.nextInt();

        // Calculate miles per gallon
        double mpg = (double) n / m;
        System.out.println("Miles per gallon: " + mpg);

        // Close Scanner object to avoid resource leak
        in.close();
    }
}
