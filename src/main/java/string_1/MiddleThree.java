package string_1;

import java.util.*;

/**
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
 * Source: http://codingbat.com/prob/p115863
 */
public class MiddleThree {
  public String middleThree(String str) {
    int mid = str.length() / 2;
    return str.substring(mid - 1, mid + 2);
  }
}

