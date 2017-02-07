package recursion_1;

import java.util.*;

/**
 * Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
 * Source: http://codingbat.com/prob/p118182
 */
public class StrCopies {
  public boolean strCopies(String str, String sub, int n) {
    if (str.length() < sub.length()) return n == 0;
    else return strCopies(str.substring(1), sub, str.startsWith(sub) ? n - 1 : n);
  }
}

