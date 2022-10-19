package com.example.labone;

/**
 * Filename: GlancyBrendanLabOne.java
 *
 * @Author: Brendan Glancy
 * @Date: 10/18/2022
 * @Description: Chapter 12 Programming Challenge 7. Travel Expenses
 *               Create a GUI application that calculates and displays the total
 *               expenses of a business trip.
 *               The user should be able to enter:
 *               the number of days spent on the trip,
 *               amount of airfare, if any
 *               car rental charges, if any,
 *               the number of miles driven if a private vehicle was used,
 *               the parking fees per day,
 *               the taxi charges,
 *               the conference or seminar registration fees,
 *               and the lodging charges per night.
 *
 *               The company reimburses at the following rates:
 *               47$ per day for meals
 *               Parking fees up to 20.00$ per day
 *               Taxi charges up to 40.00$ per day
 *               Lodging up to 195.00$ per day
 *               if a private vehicle was used, the company reimburses at 0.42$
 *               per mile
 *
 *               The application should calculate and display the following:
 *               Total expenses incurred by the businessperson
 *               The total allowable expenses for the trip
 *               The excess that must be paid by the businessperson, if any
 *               The amount saved by the businessperson if the expenses were under the total allowed.
 */


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GlancyBrendanLabOne extends Application {

    /**
     * @description: initialization of variables and labels
     */
    private TextField daysSpent;
    private TextField airfare;
    private TextField carRental;
    private TextField milesDriven;
    private TextField parkingFees;
    private TextField taxiCharges;
    private TextField conferenceFees;
    private TextField lodgingCharges;

    private Label totalExpenses;
    private Label totalAllowed;
    private Label totalExpensesExcess;
    private Label totalExpensesSaved;
    private Label totalExpensesSavedLabel;
    private Label totalExpensesExcessLabel;
    private Label totalAllowedLabel;
    private Label totalExpensesLabel;

    private Label daysSpentLabel;
    private Label airfareLabel;
    private Label carRentalLabel;
    private Label milesDrivenLabel;
    private Label parkingFeesLabel;
    private Label taxiChargesLabel;
    private Label conferenceFeesLabel;
    private Label lodgingChargesLabel;


    /**
     * @description: main method
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }


    /**
     * @param primaryStage
     * @description: Standard JavaFX start method
     */
    @Override
    public void start(Stage primaryStage) {

        /**
         * @description: setting the constant variables for the calculations
         */
        final int MEAL_RATE = 47;
        final int PARKING_RATE = 20;
        final int TAXI_RATE = 40;
        final int LODGING_RATE = 195;
        final double MILE_RATE = 0.42;


        /**
         * @description: prompt the users to enter the nessesary information
         */
        daysSpentLabel = new Label("Enter the number of days spent on the trip: ");
        airfareLabel = new Label("Enter the amount of airfare: ");
        carRentalLabel = new Label("Enter the car rental charges: ");
        milesDrivenLabel = new Label("Enter the number of miles driven (If a private vehicle was used): ");
        parkingFeesLabel = new Label("Enter the parking fees per day: ");
        taxiChargesLabel = new Label("Enter the taxi charges: ");
        conferenceFeesLabel = new Label("Enter the conference or seminar registration fees: ");
        lodgingChargesLabel = new Label("Enter the lodging charges per night: ");

        /**
         * @description: Display the results of the calculations
         */
        totalExpensesLabel = new Label("Total Expenses: ");
        totalAllowedLabel = new Label("Total Allowed: ");
        totalExpensesExcessLabel = new Label("Total Expenses Excess: ");
        totalExpensesSavedLabel = new Label("Total Expenses Saved: ");


        /**
         * @description: create the text fields for the user to enter the information
         */
        daysSpent = new TextField();
        airfare = new TextField();
        carRental = new TextField();
        milesDriven = new TextField();
        parkingFees = new TextField();
        taxiCharges = new TextField();
        conferenceFees = new TextField();
        lodgingCharges = new TextField();

        /**
         * @description: create the labels for the user to see the results
         */
        Label totalExpensesValue = new Label();
        Label totalAllowedValue = new Label();
        Label totalExpensesExcessValue = new Label("$0.00");
        Label totalExpensesSavedValue = new Label("$0.00");

        /**
         * @description: create the buttons for the user to click
         */
        Button calculateButton = new Button("Calculate");
        Button exitButton = new Button("Exit");

        /**
         * @function: calculateButton.setOnAction lambda function
         * @description: calculate the total expenses of the trip
         */
        calculateButton.setOnAction(e -> {
            /**
             * @description: initialize the variables for the calculations
             */
            double daysSpentDouble = Double.parseDouble(daysSpent.getText());
            double airfareDouble = Double.parseDouble(airfare.getText());
            double carRentalDouble = Double.parseDouble(carRental.getText());
            double milesDrivenDouble = Double.parseDouble(milesDriven.getText());
            double parkingFeesDouble = Double.parseDouble(parkingFees.getText());
            double taxiChargesDouble = Double.parseDouble(taxiCharges.getText());
            double conferenceFeesDouble = Double.parseDouble(conferenceFees.getText());
            double lodgingChargesDouble = Double.parseDouble(lodgingCharges.getText());

            /**
             * @description: calculate the total expense that the company will pay
             *              set this to totalAllowedValue
             */
            double mealExpensesPaid = daysSpentDouble * MEAL_RATE;
            double parkingExpensesPaid = daysSpentDouble * PARKING_RATE;
            double taxiExpensesPaid = daysSpentDouble * TAXI_RATE;
            double lodgingExpensesPaid = daysSpentDouble * LODGING_RATE;
            double mileExpensesPaid = milesDrivenDouble * MILE_RATE;

            double totalExpensesPaid = mealExpensesPaid + parkingExpensesPaid + taxiExpensesPaid + lodgingExpensesPaid + mileExpensesPaid;
            totalAllowedValue.setText(String.format("$%.2f", totalExpensesPaid));

            /**
             * @description: calculate the total expenses based on the user input
             *             set this to totalExpensesValue
             */
            double totalExpensesDouble = airfareDouble + carRentalDouble + parkingFeesDouble + taxiChargesDouble + conferenceFeesDouble + lodgingChargesDouble;
            totalExpensesValue.setText(String.format("$%.2f", totalExpensesDouble));

            /**
             * @description: See if the has gone over the total expenses allowed
             *             if they have, calculate the excess and set it to totalExpensesExcessValue
             *             if they have not, calculate the amount saved and set it to totalExpensesSavedValue
             */
            if (totalExpensesDouble > totalExpensesPaid) {
                double totalExpensesExcess = totalExpensesDouble - totalExpensesPaid;
                totalExpensesExcessValue.setText(String.format("$%.2f", totalExpensesExcess));
            } else {
                double totalExpensesSaved = totalExpensesPaid - totalExpensesDouble;
                totalExpensesSavedValue.setText(String.format("$%.2f", totalExpensesSaved));
            }

        });

        /**
         * @function: exitButton.setOnAction
         * @description: when the exit button is clicked, the program will exit
         */
        exitButton.setOnAction(e -> {
            System.exit(0);
        });

        /**
         * @description: create the layout for the program
         */
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(12, 12, 12, 12));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(daysSpentLabel, 0, 0);
        gridPane.add(daysSpent, 1, 0);
        gridPane.add(airfareLabel, 0, 1);
        gridPane.add(airfare, 1, 1);
        gridPane.add(carRentalLabel, 0, 2);
        gridPane.add(carRental, 1, 2);
        gridPane.add(milesDrivenLabel, 0, 3);
        gridPane.add(milesDriven, 1, 3);
        gridPane.add(parkingFeesLabel, 0, 4);
        gridPane.add(parkingFees, 1, 4);
        gridPane.add(taxiChargesLabel, 0, 5);
        gridPane.add(taxiCharges, 1, 5);
        gridPane.add(conferenceFeesLabel, 0, 6);
        gridPane.add(conferenceFees, 1, 6);
        gridPane.add(lodgingChargesLabel, 0, 7);
        gridPane.add(lodgingCharges, 1, 7);

        /**
         * @description add some space between the input and the output
         */
        gridPane.add(new Label(), 0, 8);
        gridPane.add(new Label(), 0, 9);




        /**
         * @description: These are the labels for the results
         */
        gridPane.add(totalExpensesLabel, 0, 10);
        gridPane.add(totalExpensesValue, 1, 10);
        gridPane.add(totalAllowedLabel, 0, 11);
        gridPane.add(totalAllowedValue, 1, 11);
        gridPane.add(totalExpensesExcessLabel, 0, 12);
        gridPane.add(totalExpensesExcessValue, 1, 12);
        gridPane.add(totalExpensesSavedLabel, 0, 13);
        gridPane.add(totalExpensesSavedValue, 1, 13);

        /**
         * @description: These are the buttons
         */
        gridPane.add(calculateButton, 0, 14);
        gridPane.add(exitButton, 1, 14);


        /**
         * @description: create the scene and set the stage
         */
        Scene scene = new Scene(gridPane, 650, 490);
        primaryStage.setTitle("Business Trip Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
