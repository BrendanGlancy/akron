import java.util.Scanner;

// Brendan Glancy
// Feb 8 2022
// Home exercise: 3.13

/*******************************
 *
 * A mobile phone service provider has three differenct subscription packages for its customers
 *
 * Package A:
 * For $39.99 a month, 450 minutes are provided.
 * Additional minutes are $0.45 per minute.
 *
 * Package B:
 * For $59.99 a month, 900 minutes are provided.
 * Additional minutes are $0.40 per minute.
 *
 * Package C:
 * For $69.99 a month, unlimited minutes are provided.
 *
 * Write a program that calculates the customers monthly bill.
 * It should ask the user to enter the package type (A, B, or C), the number of minutes used.
 * It should then display the amount due.
 *
 *******************************/

class Ch3Ex13Glancy {
    public static void main(String[] args) {

        // Define a Scanner object
        // Ask the user to enter the package type (A, B, or C)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter package type (A, B, or C): ");
        String packageType = input.next();

        // Ask the user to enter the number of minutes used
        // Convert the input to an int
        // If the input is not an int, display an error message
        // If the input is an int, display the amount due
        // If the input is an int, but not a valid package type, display an error message
        System.out.print("Enter number of minutes used: ");
        int minutesUsed = input.nextInt();
        // make minutesUsed upper case
        packageType = packageType.toUpperCase();

        if (minutesUsed < 0) {
            System.err.println("Error: Number of minutes used must be greater than 0");
        }

        // Calculate the amount due
        // If the package type is A, calculate the amount due
        // If the package type is B, calculate the amount due
        // If the package type is C, calculate the amount due
        // If the package type is not A, B, or C, display an error message
        double amountDue = 0.0;
        if (packageType.equals("A")) {
            amountDue = 39.99 + (minutesUsed - 450) * 0.45;
        } else if (packageType.equals("B")) {
            amountDue = 59.99 + (minutesUsed - 900) * 0.40;
        } else if (packageType.equals("C")) {
            amountDue = 69.99;
        } else {
            System.out.println("Error: Invalid package type");
        }

        // Display the amount due
        System.out.printf("Amount due: $%.2f\n", amountDue);

        // Close the Scanner object
        input.close();

    }
}
