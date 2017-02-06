package warmup_1;

import java.util.*;

/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
 * Source: http://codingbat.com/prob/p177372
 */
public class Max1020 {
  public int max1020(int a, int b) {
    boolean inRangeA = contains(10, 20, a);
    boolean inRangeB = contains(10, 20, b);
    if (inRangeA && inRangeB) return Math.max(a, b);
    else if (inRangeA) return a;
    else if (inRangeB) return b;
    else return 0;
  }
  
  boolean contains(int rangeStart, int rangeEnd, int value) {
    return rangeStart <= value && value <= rangeEnd;
  }
}

