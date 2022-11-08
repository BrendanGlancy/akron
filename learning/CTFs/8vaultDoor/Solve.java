public class Solve {
  public static void main(String[] args) {
    // Call the brute force function
    bruteForce();
  }

  public static void bruteForce() {
    String flag = "picoCTF{";
    String password = "picoCTF{";
    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    while (flag.length() < 32) {
      for (int i = 0; i < alphabet.length(); i++) {
        password = flag + alphabet.charAt(i);
        if (checkPassword(password)) {
          flag = password;
          System.out.println(flag);
          break;
        }
      }
    }
  }

  public static  int[] passwordToIntArray(String hex) {
      int[] x = new int[8];
      byte[] hexBytes = hex.getBytes();
      for (int i=0; i<8; i++) {
          x[i] = hexBytes[i*4]   << 24
               | hexBytes[i*4+1] << 16
               | hexBytes[i*4+2] << 8
               | hexBytes[i*4+3];
      }
      return x;
  }

  public static boolean checkPassword(String password) {
      if (password.length() != 32) {
          return false;
      }
      int[] x = passwordToIntArray(password);
      return x[0] == 1096770097
          && x[1] == 1952395366
          && x[2] == 1600270708
          && x[3] == 1601398833
          && x[4] == 1716808014
          && x[5] == 1734291511
          && x[6] == 960049251
          && x[7] == 1681089078;
  }
}
