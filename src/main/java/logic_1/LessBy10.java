package logic_1;

import java.util.*;

/**
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 * Source: http://codingbat.com/prob/p179196
 */
public class LessBy10 {
  public boolean lessBy10(int a, int b, int c) {
    return isOk(a, b) || isOk(b, c) || isOk(a, c);
  }
  
  boolean isOk(int a, int b) { return Math.abs(a - b) >= 10; }
}

