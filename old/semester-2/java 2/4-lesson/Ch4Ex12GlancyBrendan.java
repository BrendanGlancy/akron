import java.util.Scanner;

// Feb 10 2022
// Home exercise: 4.12

/*
 *
 * @author Brendan Glancy
 *
 * write a program that asks the user to enter todays sales for five stores.
 * The program should display a bar chart showing the amount of sales for each store.
 * Create each bar in the bar chart by displaying asterisks (*) for every 100 dollars of sales.
 *
 * Example output:
 * Enter the sales for store 1: 1000
 * Enter the sales for store 2: 1200
 * Enter the sales for store 3: 1800
 * Enter the sales for store 4: 2200
 *
 * Store 1: *********
 * Store 2: ***********
 * Store 3: ***************
 * Store 4: *******************
 *
 */

public class Ch4Ex12GlancyBrendan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int store1, store2, store3, store4, store5;
        System.out.println("Enter the sales for store 1: ");
        store1 = input.nextInt();
        System.out.println("Enter the sales for store 2: ");
        store2 = input.nextInt();
        System.out.println("Enter the sales for store 3: ");
        store3 = input.nextInt();
        System.out.println("Enter the sales for store 4: ");
        store4 = input.nextInt();
        System.out.println("Enter the sales for store 5: ");
        store5 = input.nextInt();

        System.out.println("Store 1: " + getStars(store1));
        System.out.println("Store 2: " + getStars(store2));
        System.out.println("Store 3: " + getStars(store3));
        System.out.println("Store 4: " + getStars(store4));
        System.out.println("Store 5: " + getStars(store5));

        // close scanner
        input.close();
    }

    // method to get the stars
    public static String getStars(int sales) {
        String stars = "";
        for (int i = 0; i < sales / 100; i++) {
            stars += "*";
        }
        return stars;
    }
}
