package warmup_1;

import java.util.*;

/**
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 * Source: http://codingbat.com/prob/p144535
 */
public class In1020 {
  public boolean in1020(int a, int b) {
    return contains(10, 20, a) || contains(10, 20, b);
  }
  
  boolean contains(int rangeStart, int rangeEnd, int value) {
    return rangeStart <= value && value <= rangeEnd;
  }
}

