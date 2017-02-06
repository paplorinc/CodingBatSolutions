package ap_1;

import java.util.*;

/**
 * Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
 * Source: http://codingbat.com/prob/p121236
 */
public class WordsWithout {
  public String[] wordsWithout(String[] words, String target) {
    int count = 0;
    for (String word : words)
      if (!target.equals(word))
        count++;
    
    String[] result = new String[count];
    for (int i = 0, j = 0; j < count; i++)
      if (!target.equals(words[i]))
        result[j++] = words[i];
    
    return result;
  }
}

