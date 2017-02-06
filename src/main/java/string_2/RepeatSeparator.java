package string_2;

import java.util.*;

/**
 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
 * Source: http://codingbat.com/prob/p109637
 */
public class RepeatSeparator {
  public String repeatSeparator(String word, String sep, int count) {
    if (count == 0) return "";
    else if (count == 1) return word;
    else {
      StringBuilder result = new StringBuilder(word);
      for (int i = 1; i < count; i++)
        result.append(sep).append(word);
      return result.toString();
    }
  }
}

