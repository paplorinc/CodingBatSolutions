package warmup_2;

import java.util.*;

/**
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
 * Source: http://codingbat.com/prob/p198640
 */
public class StringMatch {
  public int stringMatch(String a, String b) {
    int count = 0;
    for(int i = 0, length = Math.min(a.length(), b.length()) - 1; i < length; i++) {
      if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
        count++;
    }
    return count;
  }
}

