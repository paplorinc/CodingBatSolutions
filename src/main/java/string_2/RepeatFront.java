package string_2;

import java.util.*;

/**
 * Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
 * Source: http://codingbat.com/prob/p128796
 */
public class RepeatFront {
  public String repeatFront(String str, int n) {
    StringBuilder result = new StringBuilder(n * (n - 1) / 2);
    while (n-- > 0)
      result.append(str.substring(0, n + 1));
    return result.toString();
  }
}

