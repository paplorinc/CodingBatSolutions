package string_3;

import java.util.*;

/**
 * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
 * Source: http://codingbat.com/prob/p179479
 */
public class MaxBlock {
  public int maxBlock(String str) {
    int max = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      for (int j = i; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
              max = Math.max(max, j - i + 1);
        } else {
          i = j - 1;
          break;
        }
      }
    }
    return max;
  }
}

