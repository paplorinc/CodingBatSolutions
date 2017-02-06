package warmup_1;

import java.util.*;

/**
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
 * Source: http://codingbat.com/prob/p183592
 */
public class Front22 {
  public String front22(String str) {
    if (str.isEmpty()) return str;
    else {
      String prefix = str.substring(0, Math.min(str.length(), 2));
      return prefix + str + prefix;
    }
  }
}

