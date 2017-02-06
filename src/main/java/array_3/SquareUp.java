package array_3;

import java.util.*;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
 * Source: http://codingbat.com/prob/p155405
 */
public class SquareUp {
  public int[] squareUp(int n) {
    int[] result = new int[n * n];
    for (int i = result.length - 1, shift = 0; i >= 0; i -= shift++)
      for (int j = 1; j <= n - shift; j++)
        result[i--] = j;
    return result;
  }
}

