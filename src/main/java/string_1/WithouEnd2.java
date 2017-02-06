package string_1;

import java.util.*;

/**
 * Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
 * Source: http://codingbat.com/prob/p174254
 */
public class WithouEnd2 {
  public String withouEnd2(String str) {
    if (str.length() <= 2) return "";
    else return str.substring(1, str.length() - 1);
  }
}

