package recursion_1;

import java.util.*;

/**
 * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
 * Source: http://codingbat.com/prob/p154048
 */
public class CountPairs {
  public int countPairs(String str) {
    if (str.length() < 3) return 0;
    else return ((str.charAt(0) == str.charAt(2)) ? 1 : 0) + countPairs(str.substring(1));
  }
}

