package string_2;

import java.util.*;

/**
 * Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
 * Source: http://codingbat.com/prob/p170829
 */
public class PlusOut {
  public String plusOut(String str, String word) {
    StringBuilder result = new StringBuilder(str);
    for (int i = 0; i < str.length(); i++)
      if (str.substring(i).startsWith(word))
        i += word.length() - 1;
      else
        result.setCharAt(i, '+');
    return result.toString();
  }
}

