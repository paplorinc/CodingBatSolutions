package warmup_1;

import java.util.*;

/**
 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
 * Source: http://codingbat.com/prob/p184004
 */
public class NearHundred {
  public boolean nearHundred(int n) {
    int diff100 = Math.abs(n - 100);
    int diff200 = Math.abs(n - 200);
    return (diff100 <= 10)
| (diff200 <= 10);
  }
}

