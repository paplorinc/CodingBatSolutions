package ap_1;

import java.util.*;

/**
 * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
 * Source: http://codingbat.com/prob/p183837
 */
public class WordsFront {
  public String[] wordsFront(String[] words, int n) {
    String[] result = new String[n];
    for (int i = 0; i < n; i++)
      result[i] = words[i];
    return result;
  }
}

