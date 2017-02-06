package array_1;

import java.util.*;

/**
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
 * Source: http://codingbat.com/prob/p109660
 */
public class Start1 {
  public int start1(int[] a, int[] b) {
    int count = 0;
    for (int[] array : new int[][]{a, b})
      if (array.length >= 1 && array[0] == 1)
        count++;
    return count;
  }
}

