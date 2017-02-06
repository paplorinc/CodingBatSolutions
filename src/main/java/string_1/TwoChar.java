package string_1;

import java.util.*;

/**
 * Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
 * Source: http://codingbat.com/prob/p144623
 */
public class TwoChar {
  public String twoChar(String str, int index) {
    index = Math.max(0, index);
    if (index > str.length() - 2) index = 0;
    return str.substring(index, index + 2);
  }
}

