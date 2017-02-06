package logic_2;

import java.util.*;

/**
 * Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
 * Source: http://codingbat.com/prob/p198700
 */
public class EvenlySpaced {
  public boolean evenlySpaced(int a, int b, int c) {
    int[] sorted = new int[]{a, b, c};
    Arrays.sort(sorted);
    return (sorted[1] - sorted[0]) == (sorted[2] - sorted[1]);
  }
}

