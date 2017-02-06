package recursion_1;

import java.util.*;

/**
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
 * Source: http://codingbat.com/prob/p154669
 */
public class Factorial {
  public int factorial(int n) {
    if (n <= 2) return n;
    else return n * factorial(n - 1);
  }
}

