package ap_1;

import java.util.*;

/**
 * Given an array of strings, return the count of the number of strings with the given length.
 * Source: http://codingbat.com/prob/p124620
 */
public class WordsCount {
  public int wordsCount(String[] words, int len) {
    int count = 0;
    for (String word : words)
      if (word.length() == len)
        count++;
    return count;
  }
}

