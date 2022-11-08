import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

class Sol {
  public static void main(String[] args) {
    char[] expected = {
      0xF4, 0xC0, 0x97, 
      0xF0, 0x77, 0x97,
      0xC0, 0xE4, 0xF0,
      0x77, 0xA4, 0xD0, 
      0xC5, 0x77, 0xF4, 
      0x86, 0xD0, 0xA5,
      0x45, 0x96, 0x27, 
      0xB5, 0x77, 0xC2,
      0xD2, 0x95, 0xA4, 
      0xF0, 0xD2, 0xD2, 
      0xC1, 0x95 
    }; 
    System.out.println(String.valueOf(unscramble(String.valueOf(expected))));
  }

  // unscramble the password
  static public char[] unscramble(String input) {
    char[] a = input.toCharArray();
    for (int i = 0; i < a.length; i++) {
      char c = a[i];c = switchBits(c, 6, 7);
       c = switchBits(c, 2, 5);
       c = switchBits(c, 3, 4);
       c = switchBits(c, 0, 1);
       c = switchBits(c, 4, 7);
       c = switchBits(c, 5, 6);
       c = switchBits(c, 0, 3);
       c = switchBits(c, 1, 2);
       a[i] = c;
    }
    return a;
  }

  // switchBits
  static public char switchBits(char c, int p1, int p2) {
    char mask1 = (char)(1 << p1);
    char mask2 = (char)(1 << p2);
    char bit1 = (char)(c & mask1);
    char bit2 = (char)(c & mask2);
    char rest = (char)(c & ~(mask1 | mask2));
    char shift = (char)(p2 - p1);
    return (char)(rest | (bit1 << shift) | (bit2 >> shift));
  }
}
