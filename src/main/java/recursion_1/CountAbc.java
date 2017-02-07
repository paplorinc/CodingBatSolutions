package recursion_1;

import java.util.*;

/**
 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 * Source: http://codingbat.com/prob/p161124
 */
public class CountAbc {
  public int countAbc(String str) {
    if (str.length() < 3) return 0;
    else return ((str.startsWith("ab") && ((str.charAt(2) == 'a') || (str.charAt(2) == 'c'))) ? 1 : 0)
       + countAbc(str.substring(1));
  }
}

