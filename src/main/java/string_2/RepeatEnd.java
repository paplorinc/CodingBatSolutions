package string_2;

import java.util.*;

/**
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
 * Source: http://codingbat.com/prob/p152339
 */
public class RepeatEnd {
  public String repeatEnd(String str, int n) {
    StringBuilder result = new StringBuilder(str.length() * n);
    String part = str.substring(str.length() - n);
    for (int i = 0; i < n; i++)
      result.append(part);
    return result.toString();
  }
}

