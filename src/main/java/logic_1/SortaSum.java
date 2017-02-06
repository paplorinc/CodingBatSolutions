package logic_1;

import java.util.*;

/**
 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
 * Source: http://codingbat.com/prob/p183071
 */
public class SortaSum {
  public int sortaSum(int a, int b) {
    int sum = a + b;
    return (10 <= sum && sum <= 19) ? 20 : sum;
  }
}

