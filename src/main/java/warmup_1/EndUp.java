package warmup_1;

import java.util.*;

/**
 * Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
 * Source: http://codingbat.com/prob/p125268
 */
public class EndUp {
  public String endUp(String str) {
    String suffix = str.substring(Math.max(0, str.length() - 3), str.length());
    String prefix = str.substring(0, str.length() - suffix.length());
    return prefix + suffix.toUpperCase();
  }
}

