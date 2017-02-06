package warmup_1;

import java.util.*;

/**
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 * Source: http://codingbat.com/prob/p182873
 */
public class Makes10 {
  public boolean makes10(int a, int b) {
    return (a == 10 || b == 10 || a + b == 10);
  }
}

