package warmup_2;

import java.util.*;

/**
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 * Source: http://codingbat.com/prob/p121596
 */
public class AltPairs {
  public String altPairs(String str) {
    StringBuilder result = new StringBuilder(str.length());
    for(int i = 0; i < str.length(); i += 4)
      result.append(str.substring(i, Math.min(str.length(), i + 2)));
    return result.toString();
  }
}

