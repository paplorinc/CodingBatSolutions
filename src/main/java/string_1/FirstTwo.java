package string_1;

import java.util.*;

/**
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
 * Source: http://codingbat.com/prob/p163411
 */
public class FirstTwo {
  public String firstTwo(String str) {
    return str.substring(0, Math.min(str.length(), 2));
  }
}

