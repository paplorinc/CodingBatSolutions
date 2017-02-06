package warmup_2;

import java.util.*;

/**
 * Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
 * Source: http://codingbat.com/prob/p178318
 */
public class Last2 {
  public int last2(String str) {
    String last = str.substring(Math.max(0, str.length() - 2));
  
    int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i).startsWith(last)) {
        count++;
      }
    }
    
    return count;
  }
}

