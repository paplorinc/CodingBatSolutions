package warmup_1;

import java.util.*;

/**
 * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
 * Source: http://codingbat.com/prob/p132134
 */
public class In3050 {
  public boolean in3050(int a, int b) {
    return (contains(30, 40, a) && contains(30, 40, b))
| (contains(40, 50, a) && contains(40, 50, b));
  }
  
  boolean contains(int rangeStart, int rangeEnd, int value) {
    return rangeStart <= value && value <= rangeEnd;
  }
}

