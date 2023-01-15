import java.sql.*;
import java.util.Scanner;

public class CoffeeMetadata {
  public static void main(String[] args) {
    final String DB_URL = "jdbc:derby:CoffeeDB";

    try {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("The SELECT statement: ");
      String sqlStatement = keyboard.nextLine();

      Connection conn = DriverManager.getConnection(DB_URL);
      Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
      ResultSet resultSet = stmt.executeQuery(sqlStatement);

      ResultSetMetaData metaData = resultSet.getMetaData();
      int numberOfColumns = metaData.getColumnCount();
      System.out.println("Coffee Table of " + DB_URL);
      for (int i = 1; i <= numberOfColumns; i++) {
        System.out.println(metaData.getColumnName(i) + "\t" + metaData.getColumnTypeName(i));
      }

      while (resultSet.next()) {
        for (int i = 1; i <= numberOfColumns; i++) {
          System.out.print(resultSet.getString(i) + "\t");
        }
        System.out.println();
      }
  } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
