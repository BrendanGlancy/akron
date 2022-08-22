import java.util.Scanner;

public class Lecture {
    /**
     * program to calculate the distance traveled by a car
     */
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter the speed of the car
        System.out.print("Enter the speed of the car (MPH): ");

        // Read the speed of the car
        // Note: the speed is in mph
        double speed = input.nextDouble();
        // Prompt user to enter the time traveled
        // Note: the time is in hours
        System.out.print("Enter the time traveled (Hours): ");
        // Read the time traveled
        double time = input.nextDouble();

        // Calculate the distance traveled
        // Note: the distance is in miles
        // Note: the formula is d = s * t
        double distance = speed * time;
        // Display the distance traveled
        System.out.println("The distance traveled is " + distance + " miles.");

        // for loop to show the distance traveled for each hour
        // Note: the distance is in miles
        for (int i = 1; i <= time; i++) {
            // Calculate the distance traveled for each hour
            // Note: the distance is in miles
            // Note: the formula is d = s * t
            distance = speed * i;
            // Display the distance traveled for each hour
            System.out.println("The distance traveled after " + i + " hour(s) is " + distance + " miles.");
        }

        // Close Scanner object
        input.close();
    }
}
