package warmup_1;

import java.util.*;

/**
 * Given three int values, a b c, return the largest.
 * Source: http://codingbat.com/prob/p101887
 */
public class IntMax {
  public int intMax(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }
}

