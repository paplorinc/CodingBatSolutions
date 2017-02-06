package string_2;

import java.util.*;

/**
 * Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
 * Source: http://codingbat.com/prob/p147538
 */
public class WordEnds {
  public String wordEnds(String str, String word) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i + word.length() <= str.length(); i++)
      if (str.substring(i).startsWith(word)) {
        if (i > 0) result.append(str.charAt(i - 1));
        if (i + word.length() < str.length())  result.append(str.charAt(i + word.length()));
      }
        
    return result.toString();
  }
}

