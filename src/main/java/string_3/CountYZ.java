package string_3;

import java.util.*;

/**
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 * Source: http://codingbat.com/prob/p199171
 */
public class CountYZ {
  public int countYZ(String str) {
    int count = 0;
    String[] words = str.split("(?i)[^a-z]");
    for (String word : words)
      if (word.matches("(?i).*(y|z)$"))
        count++;
    return count;
  }
}

