package array_1;

import java.util.*;

/**
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
 * Source: http://codingbat.com/prob/p109537
 */
public class BiggerTwo {
  public int[] biggerTwo(int[] a, int[] b) {
    int sum1 = a[0] + a[1];
    int sum2 = b[0] + b[1];
    if (sum1 >= sum2) return a;
    else return b;
  }
}

