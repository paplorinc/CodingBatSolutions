package warmup_1;

import java.util.*;

/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 * Source: http://codingbat.com/prob/p154485
 */
public class SumDouble {
  public int sumDouble(int a, int b) {
    int sum = a + b;
    return (a == b) ? 2 * sum
                    : sum;
  }
}

