package string_2;

import java.util.*;

/**
 * Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
 * Source: http://codingbat.com/prob/p136417
 */
public class PrefixAgain {
  public boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);
    return str.lastIndexOf(prefix) >= n;
  }
}

