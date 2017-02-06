package string_1;

import java.util.*;

/**
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
 * Source: http://codingbat.com/prob/p138183
 */
public class LastChars {
  public String lastChars(String a, String b) {
    String first = a.isEmpty() ? "@" : a.substring(0, 1);
    String last = b.isEmpty() ? "@" : b.substring(b.length() - 1);
    return first + last;
  }
}

