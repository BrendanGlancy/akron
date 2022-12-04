/**
 * Purpose: This program implements a TCP echo server. The server listens on a
 *         well-known port and echoes back any data received from a client.
 *         The server will run until killed.
 *
 *         The server uses the following command line arguments:
 *         java TCPEchoServer <local port>
 *         where <local port> is the well-known port number on which the server
 *         will listen for incoming connections.
 *
 *         The server uses the following protocol:
 *         1. The server sends a welcome message to the client.
 *         2. The server then echoes back any data received from the client.
 *         3. The server closes the connection with the client.
 *         4. The server goes back to step 1.
 *
 */

import java.net.*;
import java.util.*;
import java.io.*;


public class TCPEchoServer {
  private static ServerSocket serverSocket;
  private static final int PORT = 1234;

  public static void main(String[] args) {
    /**
     * Infinite loop to listen for and handle client connections.
     */

    System.out.println("Opening port...\n");
    try  {
      /**
       * Creates a server socket object and binds it to the port number
       */
      serverSocket = new ServerSocket(PORT);
    } 
    catch (IOException ioEx) {
      System.out.println("Unable to attach to port!");
      System.exit(1);
    }

    /**
     * Listens for a connection request from a client.
     */
    do {
      // Put the server into an infinite waiting state.
      handleClient();
    } while (true);
  }

  /**
   * This method handles the client connection.
   */
  public static void handleClient() {
    Socket link = null;  // Socket object for the client connection.

    try {
      /**
       * Waits for a connection request from a client.
       */
      link = serverSocket.accept();

      /**
       * Creates a Scanner object to read data from the client.
       * getInputStream() returns an InputStream object that is connected to the
       * socket's input stream
       */
      Scanner input = new Scanner(link.getInputStream());

      /**
       * Creates a PrintWriter object to send data to the client.
       */
      PrintWriter output = new PrintWriter(link.getOutputStream(), true);

      /**
       * Sends a welcome message to the client.
       */
      output.println("Welcome to the echo server. Enter 'BYE' to exit.");

      /**
       * Reads data from the client and echoes it back.
       */
      int numMessages = 0;
      String message = input.nextLine();

      /**
       * Echoes the message back to the client.
       */
      while (!message.equals("BYE")) {
        System.out.println("Message received.");
        numMessages++;
        output.println("Message " + numMessages + ": " + message);
        message = input.nextLine();
      }

      output.println(numMessages + " messages received.");
    }
    catch (IOException ioEx) {
      ioEx.printStackTrace();
    }
    finally {
      try {
        System.out.println("Closing connection...");
        link.close();
      }
      catch (IOException ioEx) {
        System.out.println("Unable to disconnect!");
        System.exit(1);
      }
    }
  }
}
