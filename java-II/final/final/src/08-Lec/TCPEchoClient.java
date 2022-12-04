/**
 * Purpose: This program is a TCP client that sends a string to a server and
 * receives the same string back from the server. The client will send the
 * string to the server and then wait for the server to send the same string
 * back. The client will then print the string received from the server.
 *
 *
 */

import java.io.*;
import java.util.*;
import java.net.*;

public class TCPEchoClient {
  private static InetAddress host;
  private static final int PORT = 1234;

  public static void main(String[] args) {
    try {
      host = InetAddress.getLocalHost();
    } catch (UnknownHostException uhEx) {
      System.out.println("Host ID not found!");
      System.exit(1);
    }
    accessServer();
  }

  /**
   * The accessServer method creates a socket to make a connection to the server.
   */
  public static void accessServer() {
    Socket link = null; // Declare a socket and initialize it to null.

    try {
      /**
       * Create a socket to make a connection to the server. The constructor for
       * this class takes the name of the remote host and the port number as
       * arguments. This example uses the default port number, 1234.
       */
      link = new Socket(host, PORT);
      Scanner input = new Scanner(System.in);
      PrintWriter output = new PrintWriter(link.getOutputStream(), true);

      /**
       * Set up stream for keyboard entry...
       */
      Scanner keyboard = new Scanner(System.in);
      String message, response;

      do {
        System.out.print("Enter message: ");
        message = keyboard.nextLine();

        output.println(message);

        /**
         * Set up stream for reading from the server...
         */
        Scanner networkInput = new Scanner(link.getInputStream());

        response = networkInput.nextLine();

        System.out.println("" + "SERVER> " + response);
    } while (!message.equals("BYE"));
    } catch (IOException ioEx) {
      ioEx.printStackTrace();
    } finally {
      try {
        System.out.println("Closing connection...");
        link.close();
      } catch (IOException ioEx) {
        System.out.println("Unable to disconnect!");
        System.exit(1);
      }
    }
  }
}
