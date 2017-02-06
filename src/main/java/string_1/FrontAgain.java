package string_1;

import java.util.*;

/**
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
 * Source: http://codingbat.com/prob/p196652
 */
public class FrontAgain {
  public boolean frontAgain(String str) {
    if (str.length() < 2) return false;
    else {
      String start = str.substring(0, 2);
      String end = str.substring(str.length() - 2);
      return start.equals(end);
    }
  }
}

