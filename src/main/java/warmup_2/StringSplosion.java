package warmup_2;

import java.util.*;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * Source: http://codingbat.com/prob/p117334
 */
public class StringSplosion {
  public String stringSplosion(String str) {
    StringBuilder result = new StringBuilder(str.length() * (str.length() - 1) / 2);
    for(int i = 1; i <= str.length(); i++)
      result.append(str.substring(0, i));
    return result.toString();
  }
}

