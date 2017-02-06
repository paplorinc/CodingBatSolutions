package string_3;

import java.util.*;

/**
 * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 * Source: http://codingbat.com/prob/p141736
 */
public class EqualIsNot {
  public boolean equalIsNot(String str) {
    String is = "is", not = "not";
    return count(str, is) == count(str, not);
  }
  
  int count(String source, String target) { return (source.length() - source.replaceAll(target, "").length()) / target.length(); }
}

