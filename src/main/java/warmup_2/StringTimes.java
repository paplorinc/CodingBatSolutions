package warmup_2;

import java.util.*;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 * Source: http://codingbat.com/prob/p142270
 */
public class StringTimes {
  public String stringTimes(String str, int n) {
    StringBuilder result = new StringBuilder(str.length() * n);
    for(int i = 0; i < n; i++)
      result.append(str);
    return result.toString();
  }
}

