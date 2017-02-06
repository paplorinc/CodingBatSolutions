package warmup_1;

import java.util.*;

/**
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 * Source: http://codingbat.com/prob/p196441
 */
public class EveryNth {
  public String everyNth(String str, int n) {
    if (str.isEmpty()) return "";
    
    StringBuilder result = new StringBuilder(str.length() / n);
    for(int i = 0; i < str.length(); i += n) {
      result.append(str.charAt(i));
    }
    return result.toString();
  }
}

