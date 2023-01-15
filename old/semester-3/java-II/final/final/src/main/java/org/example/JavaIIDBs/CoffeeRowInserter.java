import java.sql.*;

/**
 * Purpose: Demonstrate how to insert a row into a table
 * in the CoffeeDB database.
 */

public class CoffeeRowInserter {
  public static void main(String[] args) {
    String dbUrl = "jdbc:derby:CoffeeDB";
    String insertString = "INSERT INTO Coffee VALUES " +
        "('Colombian', '101', 7.99)";

    try (
            Connection conn = DriverManager.getConnection(dbUrl);
            Statement stmt = conn.createStatement();
    ) {
      stmt.executeUpdate(insertString);
      // Check the results by listing the table contents
      String query = "SELECT * FROM Coffee";
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        String name = rs.getString("Description");
        String id = rs.getString("ProdNum");
        double price = rs.getDouble("Price");
        System.out.println(name + "\t" + id + "\t" + price + "\t");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
