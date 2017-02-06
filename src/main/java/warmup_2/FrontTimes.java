package warmup_2;

import java.util.*;

/**
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
 * Source: http://codingbat.com/prob/p101475
 */
public class FrontTimes {
  public String frontTimes(String str, int n) {
    String front = str.substring(0, Math.min(str.length(), 3));
    StringBuilder result = new StringBuilder(front.length() * n);
    for(int i = 0; i < n; i++)
      result.append(front);
    return result.toString();
  }
}

