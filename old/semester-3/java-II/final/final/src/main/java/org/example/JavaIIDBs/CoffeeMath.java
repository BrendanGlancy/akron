package org.example.JavaIIDBs;

import java.sql.*;

/**
 * Purpose:
 *  to demonstrate the use
 */

public class CoffeeMath {
  public static void main(String[] args) {
    double lowest, highest, average;
    String minPrice = "10.0";
    int coffeeCount = 0;

    final String DB_URL = "jdbc:derby:CoffeeDB";

    try {
      Connection conn = DriverManager.getConnection(DB_URL);
      Statement stmt = conn.createStatement();

      String minStmt = "Select MIN(Price) from Coffee";
      String maxStmt = "Select MAX(Price) from Coffee";
      String avgStmt = "Select AVG(Price) from Coffee";

      ResultSet minRS = stmt.executeQuery(minStmt);

      if (minRS.next()) {
        lowest = minRS.getDouble(1);
        System.out.println("The lowest price is: " + lowest);
      }

      ResultSet maxRS = stmt.executeQuery(maxStmt);
      if (maxRS.next()) {
        highest = maxRS.getDouble(1);
        System.out.println("The highest price is: " + highest);
      }

      ResultSet avgRS = stmt.executeQuery(avgStmt);
      if (avgRS.next()) {
        average = avgRS.getDouble(1);
        System.out.println("The average price is: " + average);
      }

      String countStmt = "Select COUNT(*) from Coffee";
      ResultSet countRS = stmt.executeQuery(countStmt);

      if (countRS.next()) {
        coffeeCount = countRS.getInt(1);
        System.out.println("The number of coffees is: " + coffeeCount);
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
