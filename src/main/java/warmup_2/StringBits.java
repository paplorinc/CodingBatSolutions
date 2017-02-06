package warmup_2;

import java.util.*;

/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 * Source: http://codingbat.com/prob/p165666
 */
public class StringBits {
  public String stringBits(String str) {
    StringBuilder result = new StringBuilder(str.length() / 2);
    for(int i = 0; i < str.length(); i += 2)
      result.append(str.charAt(i));
    return result.toString();
  }
}

