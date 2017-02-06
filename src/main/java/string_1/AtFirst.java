package string_1;

import java.util.*;

/**
 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
 * Source: http://codingbat.com/prob/p139076
 */
public class AtFirst {
  public String atFirst(String str) {
    if (str.isEmpty()) return "@@";
    else if (str.length() == 1) return str + "@";
    else return str.substring(0, 2);
  }
}

