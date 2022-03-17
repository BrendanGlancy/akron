/**
 * @author Brendan Glancy
 * Date: 03/27/22
 * Desc: Programming Challenge 10.7 and 10.8
 *
 * 10.7 Person and Customer classes
 * Design a class named Person with fields for holding a person's name, address and telephone number.
 * Write one or more constructors and the appropriate mutator and access methods for the class's fields.
 *
 * Next, design a class named Customer, which extends Person. The Customer class should have a field for a customer number and a boolean field indicating whether the customer wishes to be on a mailing list.
 * Write one or more constructors and the appropriate mutator and access methods for the class's fields.
 * Demonstrate an object of the Customer class in a simple program
 *
 * 10.8 PreferredCustomer Class
 * A retail store has a preferred customer plan where customers can earn discounts on all their purchases. The amount of a customer's discount is determined by the amount of the customers cumulative purchases in the store:
 * When the customer spends $500, he or she get a 5 percent discount on all future purchases
 * When the customer spends $1000, he or she get a 6 percent discount on all future purchases
 * When the customer spends $1500, he or she get a 7 percent discount on all future purchases
 * When the customer spends $2000, he or she get a 10 percent discount on all future purchases
 * @param getPersonName
 * @param getPersonAddress
 * @param getPersonTelephone
 * @param getCustomerNumber
 *
 *
 *
 * Design a class named PreferredCustomer, which extends the Customer class. The PreferredCustomer class should have fields for the amount of the customers purchases and the customers discount level. Write one or more constructors
 * and the appropriate mutator and access methods for the class's fields.
 * Demonstrate an object of the PreferredCustomer class in a simple program
 *
 */

class Ch10Ex7Ex8GlancyBrendan {
  public static void main(String[] args) {
    // Driver code

    // Create a new customer
    // takes in name, address, phone number, customer number, and whether they want to be on the mailing list
    // String String String int boolean
    Customer customer1 = new Customer("Brendan", "123 Main St", "555-555-5555", 1, true);

    // Print out the customer's information
    System.out.println("-- Customer information --");
    System.out.println(customer1.toString());
    System.out.println("___________________________");

    // Create a new preferred customer
    // takes in name, address, phone number, customer number, whether they want to be on the mailing list, amount of purchases, and discount level
    // String String String int boolean int double
    PreferredCustomer preferredCustomer1 = new PreferredCustomer("Brendan Glancy", "456 Main St", "330-555-5555", 1, true, 1500);

    // Print out the customer's information
    System.out.println("-- Preferred Customer information --");
    System.out.println(preferredCustomer1.toString());
    System.out.println("_____________________________________");
  }
}

class Person {
  // init
  private String personName;
  private String personAddress;
  private String personPhoneNumber;

  // Constructor
  public Person(String name, String address, String phoneNumber) {
    personName = name;
    personAddress = address;
    personPhoneNumber = phoneNumber;
  }

  // Getter and setters
  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public String getPersonAddress() {
    return personAddress;
  }

  public void setPersonAddress(String personAddress) {
    this.personAddress = personAddress;
  }

  public String getPersonPhoneNumber() {
    return personPhoneNumber;
  }

  public void setPersonPhoneNumber(String personPhoneNumber) {
    this.personPhoneNumber = personPhoneNumber;
  }

  // toString method
  public String toString() {
    return "Name: " + personName + "\nAddress: " + personAddress + "\nPhone Number: " + personPhoneNumber;
  }

}

class Customer extends Person {
  // init
  private int customerNumber;
  private boolean customerMailingList;

  // Constructor
  public Customer(String name, String address, String phoneNumber, int number, boolean mailingList) {
    super(name, address, phoneNumber);
    customerNumber = number;
    customerMailingList = mailingList;
  }

  // Getters and setters
  public int getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(int customerNumber) {
    this.customerNumber = customerNumber;
  }

  public boolean isMailingList() {
    return customerMailingList;
  }

  public void setMailingList(boolean mailingList) {
    this.customerMailingList = mailingList;
  }

  // toString
  public String toString() {
    return super.toString() + "\nCustomer Number: " + customerNumber + "\nMailing List: " + customerMailingList;
  }

}

class PreferredCustomer extends Customer {
  // init
  private int preferredPurchases;
  private double preferredDiscountLevel;

  // Constructor
  public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int purchases) {
    super(name, address, phoneNumber, customerNumber, mailingList);
    preferredPurchases = purchases;
  }

  // Getter and setters
  public int getPurchases() {
    return preferredPurchases;
  }

  public void setPurchases(int purchases) {
    preferredPurchases = purchases;
  }

  /* depending on spending level set the discount level
   * if $500, set discount level to 0.05
   * if $1000, set discount level to 0.06
   * if $1500, set discount level to 0.07
   * if $2000, set discount level to 0.10
   */
  public double getDiscountLevel() {
    if (preferredPurchases >= 500) {
      preferredDiscountLevel = 0.05;
    } else if (preferredPurchases >= 1000) {
      preferredDiscountLevel = 0.06;
    } else if (preferredPurchases >= 1500) {
      preferredDiscountLevel = 0.07;
    } else if (preferredPurchases >= 2000) {
      preferredDiscountLevel = 0.1;
    } else {
      preferredDiscountLevel = 0.0;
    }
    return preferredDiscountLevel;
  }

  // toString method
  // Override the toString method in the superclass
  // Add the discount level to the superclass toString method
  public String toString() {
    return super.toString() + "\nDiscount Level: " + getDiscountLevel() + "\nPurchases: " + preferredPurchases;
  }
}
