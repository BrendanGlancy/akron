/**
 * Demonstrate how to update a row 
 */
import java.sql.*;
import java.util.Scanner;


public class CoffeeRowUpdater {
  public static void main(String[] args) {
    String productNumber;
    double price;

    final String DB_URL = "jdbc:derby:CoffeeDB";

    Scanner keyboard = new Scanner(System.in);

    try {
      Connection conn = DriverManager.getConnection(DB_URL);
      Statement stmt = conn.createStatement();

      // Get the product number.
      System.out.print("Enter the product number: ");
      productNumber = keyboard.nextLine();

      // Get the new price.
      System.out.print("Enter the new price: ");
      price = keyboard.nextDouble();

      // Create a string with an UPDATE statement.
      String sqlStatement = "UPDATE Coffee " +
                            "SET Price = " + price +
                            " WHERE ProdNum = '" + productNumber + "'";
      System.out.println(sqlStatement);

      // Send the statement to the DBMS.
      int rows = stmt.executeUpdate(sqlStatement);
      System.out.println(rows + " row(s) updated.");

      // Try to find and display the updated row.
      findAndDisplayProduct(stmt, productNumber);
      conn.close();
    }
    catch (Exception ex) {
      System.out.println("ERROR: " + ex.getMessage());
    }
  }

  public static boolean findAndDisplayProduct(Statement stmt, String productNumber) throws SQLException {
    String sqlStatement = "SELECT * FROM Coffee " +
                          "WHERE ProdNum = '" + productNumber + "'";
    ResultSet result = stmt.executeQuery(sqlStatement);
    if (result.next()) {
      System.out.println("Description: " + result.getString("Description"));
      System.out.println("Price: " + result.getDouble("Price"));
      return true;
    }
    else {
      System.out.println("Product number not found.");
      return false;
    }
  }
}
