package string_2;

import java.util.*;

/**
 * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 * Source: http://codingbat.com/prob/p122943
 */
public class OneTwo {
  public String oneTwo(String str) {
    int jump = 3;
    StringBuilder result = new StringBuilder(str);
    result.setLength(str.length() / jump * jump);
    for (int i = 0; i + jump <= str.length(); i += jump) {
      result.insert(i + jump, result.charAt(i));
      result.deleteCharAt(i);
    }
    return result.toString();
  }
}

