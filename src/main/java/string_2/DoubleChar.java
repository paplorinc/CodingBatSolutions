package string_2;

import java.util.*;

/**
 * Given a string, return a string where for every char in the original, there are two chars.
 * Source: http://codingbat.com/prob/p165312
 */
public class DoubleChar {
  public String doubleChar(String str) {
    return str.replaceAll(".", "$0$0");
  }
}

