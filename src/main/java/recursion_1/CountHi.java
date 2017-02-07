package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 * Source: http://codingbat.com/prob/p184029
 */
public class CountHi {
  public int countHi(String str) {
    if (str.isEmpty()) return 0;
    else return (str.startsWith("hi") ? 1 : 0) + countHi(str.substring(1));
  }
}

