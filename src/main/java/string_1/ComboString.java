package string_1;

import java.util.*;

/**
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
 * Source: http://codingbat.com/prob/p168564
 */
public class ComboString {
  public String comboString(String a, String b) {
    return (a.length() < b.length())
         ? a + b + a
         : b + a + b;
  }
}

