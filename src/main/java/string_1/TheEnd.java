package string_1;

import java.util.*;

/**
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
 * Source: http://codingbat.com/prob/p162477
 */
public class TheEnd {
  public String theEnd(String str, boolean front) {
    if (front)
      return String.valueOf(str.charAt(0));
    else
      return String.valueOf(str.charAt(str.length() - 1));
  }
}

