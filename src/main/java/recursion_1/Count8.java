package recursion_1;

import java.util.*;

/**
 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * Source: http://codingbat.com/prob/p192383
 */
public class Count8 {
  public int count8(int n) {
    if (n == 0) return 0;
    else return (((n % 100) == 88) ? 2  : ((n % 10) == 8) ? 1 : 0) + count8(n / 10);
  }
}

