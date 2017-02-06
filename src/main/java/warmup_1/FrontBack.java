package warmup_1;

import java.util.*;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 * Source: http://codingbat.com/prob/p123384
 */
public class FrontBack {
  public String frontBack(String str) {
    if (str.length() < 2) return str;
    else {
      char first = str.charAt(0);
      char last = str.charAt(str.length() - 1);
      String middle = str.substring(1, Math.max(1, str.length() - 1));
      return String.valueOf(last) + middle + first;
    }
  }
}

