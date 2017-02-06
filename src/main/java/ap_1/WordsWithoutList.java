package ap_1;

import java.util.*;

/**
 * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
 * Source: http://codingbat.com/prob/p183407
 */
public class WordsWithoutList {
  public List<String> wordsWithoutList(String[] words, int len) {
    List<String> result = new ArrayList<String>(words.length);
    for (String word : words)
      if (word.length() != len)
        result.add(word);
    return result;
  }
}

