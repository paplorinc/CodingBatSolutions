package logic_2;

import java.util.*;

/**
 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
 * Source: http://codingbat.com/prob/p138990
 */
public class CloseFar {
  public boolean closeFar(int a, int b, int c) {
    return isOk(a, b, c) || isOk(b, a, c) || isOk(c, a, b);
  }
  
  boolean isClose(int a, int b) { return Math.abs(a - b) <= 1; }
  boolean isOk(int a, int b, int c) { return isClose(a, b) && (!isClose(a, c) && !isClose(b, c)); }
}

