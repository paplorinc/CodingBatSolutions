package string_1;

import java.util.*;

/**
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
 * Source: http://codingbat.com/prob/p197720
 */
public class Left2 {
  public String left2(String str) {
    return str.substring(2) + str.substring(0, 2);
  }
}

