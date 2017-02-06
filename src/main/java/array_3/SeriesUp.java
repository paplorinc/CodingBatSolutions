package array_3;

import java.util.*;

/**
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
 * Source: http://codingbat.com/prob/p104090
 */
public class SeriesUp {
  public int[] seriesUp(int n) {
    int[] result = new int[n * (n + 1) / 2];
    for (int i = 1, index = 0; i <= n; i++)
      for (int j = 1; j <= i; j++)
        result[index++] = j;
    return result;
  }
}

