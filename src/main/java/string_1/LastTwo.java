package string_1;

import java.util.*;

/**
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
 * Source: http://codingbat.com/prob/p194786
 */
public class LastTwo {
  public String lastTwo(String str) {
    if (str.length() <= 1) return str;
    else return str.substring(0, str.length() - 2) 
              + str.charAt(str.length() - 1)
              + str.charAt(str.length() - 2);
  }
}

