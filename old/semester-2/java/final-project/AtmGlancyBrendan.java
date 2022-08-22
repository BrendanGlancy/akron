import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Name: Brendan Glancy
 * Date: 04/14/2022
 *
 * Desc: This program will have 3 seperate classes. The first class being
 * AtmGlancyBrendan with the main method.
 * Use your discretion to provide the data types of the fields and other
 * variables and make proper use of OOP’s information hiding principles (use the
 * best access modifiers).
 *
 * • Define one of the classes to be abstract, with Customer as its name. The
 * class should have the
 * following data fields: name, pin, and balance. The class should also have
 * three get (accessor)
 * methods and three set (mutator) methods. Include two constructors, a no-arg
 * constructor and another
 * constructor that takes three parameters, as arguments and each of the
 * arguments should be assigned
 * to the appropriate Customer field. The class should also have four other
 * abstract methods, which
 * return no values, named: deposit(), withdraw(), checkBalance(), and quit().
 *
 * @method deposit()
 * @method withdraw()
 * @method checkBalance()
 * @method quit()
 * @method getName()
 * @method getPin()
 * @method getBalance()
 * @method setName()
 * @method setPin()
 * @method setBalance()
 * @method toString()
 *
 *         The other class named CheckingAccountCustomer (a subclass of the
 *         Customer class) should have
 *         an accountNo data field and get (accessor) and set (mutator) methods
 *         for the accountNo field. It
 *         should also have two constructors, a no-arg constructor and another
 *         constructor which takes four
 *         parameters with the 4th parameter assigned to the accountNo field,
 *         within the constructor
 *         implementation. The four Customer abstract methods should be
 *         implemented in this class as follows:
 *          deposit: Prompt a customer to enter an amount of money to be
 *         deposited into his/her
 *         account. Add this amount to the balance and print the current balance
 *         as of the current date/
 *         time to the screen.
 *          withdraw: Prompt a customer to enter an amount of money to withdraw
 *         from account. Deduct
 *         this amount to the balance and print the current balance as of the
 *         current date/time to the
 *         screen.
 *          checkBalance: This method just prints the current balance as of the
 *         current date/time to the
 *         screen.
 *          quit: This method prompts the user to exit the program (ATM). Hint:
 *         System.exit(0); forces a
 *         Java application program to terminate.
 *
 * @method getAccountNo()
 * @method setAccountNo()
 * @method toString()
 *
 *         The AtmYourLastnameFirstname class should implement an Automated
 *         Teller Machine (ATM). The
 *         main() method should have an array of three CheckingAccountCustomer
 *         objects. Provide values for
 *         the objects based on the CheckingAccountCustomer class constructor.
 *          The ATM starts by prompting customers to insert their debit card
 *         (the card is inserted by
 *         entering an account number). The account number should be equal to
 *         one of the
 *         CheckingAccountCustomer object’s accountNo for the card to be
 *         accepted by the ATM.
 *          When a card is inserted, the ATM should then prompt customers to
 *         enter their PIN (a 4-digit
 *         number). Customers should be given 2 more chances to enter their
 *         correct PIN. The program
 *         should quit after the third unsuccessful PIN entry.
 *          If the PIN entered is accepted (equals the PIN for any of the three
 *         CheckingAccountCustomer
 *         objects), the current date and time should be displayed on the screen
 *         after which the
 *         following menu should be displayed:
 *         PRESS:
 *          (D)eposit Money
 *          (W)ithdraw Money
 *          (C)heck Account Balance
 *          (Q)uit
 *
 *         From the above menu, each choice should call its appropriate method
 *         implementation from
 *         the CheckingAccountCustomer class.
 *          Customers should be given a chance to choose whether to process
 *         another transaction or
 *         not (Hint: a loop structure should be built around the menu above.)
 *          Any additional features may attract extra credit on the exams.
 */

public class AtmGlancyBrendan {
  public static void main(String[] args) {
    // Driver Code
    // Create an array of CheckingAccountCustomer objects
    Scanner input = new Scanner(System.in);
    CheckingAccountCustomer[] customers = new CheckingAccountCustomer[3];
    // Create three CheckingAccountCustomer objects, use random names and pin
    // numbers
    // The constructor takes String name, int pin, double balance, int accountNo
    customers[0] = new CheckingAccountCustomer("Brendan", 1234, 100.00, 1);
    customers[1] = new CheckingAccountCustomer("Jane", 5678, 200.00, 2);
    customers[2] = new CheckingAccountCustomer("John", 9999, 300.00, 3);

    // Use the verify method to verify the card number and pin
    CheckingAccountCustomer.verify(customers, input);

    // Check if the accountNumber and pin entered match any of the
    // CheckingAccountCustomer objects
    // If they do, continue to the menu
    // If they don't, exit the program

  }
}

abstract class  Customer {
  protected String name;
  protected int pin;
  protected double balance;

  public Customer() {
    this.name = "";
    this.pin = 0;
    this.balance = 0;
  }

  public Customer(String name, int pin, double balance) {
    this.name = name;
    this.pin = pin;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPin() {
    return pin;
  }

  public void setPin(int pin) {
    this.pin = pin;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit() {
    System.out.println("Enter amount to deposit: ");
    double deposit = Double.parseDouble(System.console().readLine());
    this.balance += deposit;
    System.out.println("Current balance: " + this.balance);
  }

  public void withdraw() {
    System.out.println("Enter amount to withdraw: ");
    double withdraw = Double.parseDouble(System.console().readLine());
    this.balance -= withdraw;
    System.out.println("Current balance: " + this.balance);
  }

  // Check balance needs to display the current balance, and data/time
  public void checkBalance() {
    System.out.println("Current balance: " + this.balance);
    // Display the current date and time
    // Use the SimpleDateFormat class
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    System.out.println("Current date and time: " + sdf.format(date));
  }

  public void quit() {
    System.out.println("Thank you for using the ATM");
    System.exit(0);
  }

  public String toString() {
    return "Name: " + this.name + "\nPin: " + this.pin + "\nBalance: " + this.balance;
  }
}

class CheckingAccountCustomer extends Customer {
  private int accountNo;

  public CheckingAccountCustomer() {
    this.accountNo = 0;
  }

  public CheckingAccountCustomer(String name, int pin, double balance, int accountNo) {
    super(name, pin, balance);
    this.accountNo = accountNo;
  }

  public int getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(int accountNo) {
    this.accountNo = accountNo;
  }

  public void deposit() {
    System.out.println("Enter amount to deposit: ");
    double deposit = Double.parseDouble(System.console().readLine());
    this.balance += deposit;
    System.out.println("Current balance: " + this.balance);
  }

  // CheckingAccountCustomer objects
  // Give the user 3 chances to enter the correct PIN
  public static boolean verify(CheckingAccountCustomer[] customers, Scanner input) {
    System.out.println("Enter account number: ");
    int accountNo = Integer.parseInt(input.nextLine());
    System.out.println("Enter PIN: ");
    int pin = Integer.parseInt(input.nextLine());
    for (int i = 0; i < 2; i++) {
      if (customers[i].getAccountNo() == accountNo && customers[i].getPin() == pin) {
        System.out.println("Welcome " + customers[i].getName());
        int cust = customers[i].getAccountNo();
        displayMenu(customers, input, cust);
        return true;
      } else {
        System.out.println("Invalid account number or PIN");
        System.out.println("Try again " + (i + 1) + " time(s) left");
      }
    }
    System.out.println("Invalid account number or PIN");
    return false;
  }

  // Menu method
  public static void displayMenu(CheckingAccountCustomer[] customers, Scanner input, int accountNo) {
    // Allow the user to do multiple transactions
    boolean quit = true;
    while (quit) {
      System.out.println("PRESS:");
      System.out.println("(D)eposit Money");
      System.out.println("(W)ithdraw Money");
      System.out.println("(C)heck Account Balance");
      System.out.println("(Q)uit");
      String choice = input.nextLine();
      // convert to upper case
      choice = choice.toUpperCase();
      switch (choice) {
        case "D":
          customers[accountNo].deposit();
          break;
        case "W":
          customers[accountNo].withdraw();
          break;
        case "C":
          customers[accountNo].checkBalance();
          break;
        case "Q":
          customers[accountNo].quit();
          quit = false;
          break;
        default:
          System.out.println("Invalid choice");
          displayMenu(customers, input, accountNo);
      }
    }
  }

  public void withdraw() {
    System.out.println("Enter amount to withdraw: ");
    double withdraw = Double.parseDouble(System.console().readLine());
    this.balance -= withdraw;
    System.out.println("Current balance: " + this.balance);

    if (this.balance < 0) {
      System.out.println("Your account is overdrawn");
    }
  }

  public void checkBalance() {
    System.out.println("Current balance: " + this.balance);

    // BONUS
    if (this.balance < 0) {
      System.out.println("Your account is overdrawn");
    }

    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    System.out.println("Current date and time: " + sdf.format(date));
  }

  public void quit() {
    System.out.println("Thank you for using the ATM");
    System.exit(0);
  }

  public String toString() {
    return "Name: " + this.name + "\nPin: " + this.pin + "\nBalance: " + this.balance + "\nAccount No: "
        + this.accountNo;
  }
}
