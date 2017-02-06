package logic_1;

import java.util.*;

/**
 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
 * Source: http://codingbat.com/prob/p178728
 */
public class TeenSum {
  public int teenSum(int a, int b) {
    return (isTeen(a) || isTeen(b)) ? 19 : a + b;
  }
  
  boolean isTeen(int age) { return (13 <= age && age <= 19); }
}

