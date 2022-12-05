/**
 * Purpose: To demonstrate how to establish a connection to a database using JDBC (with derby protocol)
 * and how to execute a query and display the results.
 */

package org.example.JavaIIDBs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowCoffeeDescription {
  public static void main(String[] args) {
    // The database URL 
    final String DB_URL = "jdbc:derby:CoffeeDB";

    try {
      // Create a connection to the database.
      Connection conn = DriverManager.getConnection(DB_URL);

      // Create a Statement object.
      Statement stmt = conn.createStatement();

      String sqlStatement = "SELECT Description FROM Coffee";

      ResultSet result = stmt.executeQuery(sqlStatement);

      // Display the contents of the result set.
      System.out.println("Coffees in the database:");
      System.out.println("------------------------");
      while (result.next()) {
        System.out.println(result.getString("Description"));
      }


      // Close the connection.
      conn.close();
    } catch (SQLException ex) {
      System.out.println("ERROR: " + ex.getMessage());
    }
  }
}
