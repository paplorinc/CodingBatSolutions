package logic_1;

import java.util.*;

/**
 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
 * Source: http://codingbat.com/prob/p118077
 */
public class SumLimit {
  public int sumLimit(int a, int b) {
    int sum = a + b;
    if (digitCount(sum) == digitCount(a)) return sum;
    else return a;
  }
  
  int digitCount(int num) { return (int)(Math.log(num) / Math.log(10)); }
}

