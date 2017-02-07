package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
 * Source: http://codingbat.com/prob/p143900
 */
public class CountHi2 {
  public int countHi2(String str) {
    if (str.length() < 2) return 0;
    else if (str.startsWith("xhi")) return countHi2(str.substring(2));
    else return (str.startsWith("hi") ? 1 : 0) + countHi2(str.substring(1));
  }
}

