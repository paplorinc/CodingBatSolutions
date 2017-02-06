package logic_1;

import java.util.*;

/**
 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 * Source: http://codingbat.com/prob/p113261
 */
public class TwoAsOne {
  public boolean twoAsOne(int a, int b, int c) {
    int[] values = {a, b, c};
    Set<Integer> sums = new HashSet<Integer>();
    for (int i = 0; i < values.length; i++)
      for (int j = i + 1; j < values.length; j++)
        sums.add(values[i] + values[j]);
    return sums.contains(a) || sums.contains(b) || sums.contains(c);
  }
}

