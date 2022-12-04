/**
 * Purpose: to demonstrate how to find the IP address of a host
 */

import java.net.*;
import java.util.*;

public class IPAddressFinder {
    public static void main(String[] args) {
      String host;
      Scanner keyboard = new Scanner(System.in);

      InetAddress address;
      System.out.print("Enter a host name: ");
      host = keyboard.nextLine();
      
      try {
        /**
         * getByName() returns an InetAddress object
         * that represents the IP address of the host
         */
        address = InetAddress.getByName(host);
        /**
         * getHostAddress() returns the IP address
         * as a String
         */
        System.out.println("IP address: " + address.getHostAddress());
      }
      catch (UnknownHostException e) {
        System.out.println("Unknown host: " + host);
      }
    }
}
