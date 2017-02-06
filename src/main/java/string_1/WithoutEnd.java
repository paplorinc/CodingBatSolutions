package string_1;

import java.util.*;

/**
 * Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
 * Source: http://codingbat.com/prob/p130896
 */
public class WithoutEnd {
  public String withoutEnd(String str) {
    return str.substring(1, str.length() - 1);
  }
}

