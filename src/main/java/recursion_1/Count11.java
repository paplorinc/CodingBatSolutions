package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
 * Source: http://codingbat.com/prob/p167015
 */
public class Count11 {
  public int count11(String str) {
    if (str.length() < 2) return 0;
    else return str.startsWith("11")
              ? 1 + count11(str.substring(2)) 
              : count11(str.substring(1));
  }
}

