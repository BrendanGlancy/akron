import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyLocalIPAddress {
  /**
   * @param args
   */
  public static void main(String[] args) {
    try {
      InetAddress addr = InetAddress.getLocalHost();
      System.out.println("Local HostAddress: " + addr.getHostAddress());
      String hostname = addr.getHostName();
      System.out.println("Local host name: " + hostname);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
