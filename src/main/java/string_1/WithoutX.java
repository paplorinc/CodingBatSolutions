package string_1;

import java.util.*;

/**
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 * Source: http://codingbat.com/prob/p151940
 */
public class WithoutX {
  public String withoutX(String str) {
    if (!str.isEmpty() && str.charAt(0) == 'x')
      str = str.substring(1);
    if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x')
      str = str.substring(0, str.length() - 1);
    return str;
  }
}

