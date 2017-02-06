package string_1;

import java.util.*;

/**
 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
 * Source: http://codingbat.com/prob/p137729
 */
public class MiddleTwo {
  public String middleTwo(String str) {
    int mid = (str.length() / 2) - 1;
    return str.substring(mid, mid + 2);
  }
}

