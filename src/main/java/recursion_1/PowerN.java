package recursion_1;

import java.util.*;

/**
 * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
 * Source: http://codingbat.com/prob/p158888
 */
public class PowerN {
  public int powerN(int base, int n) {
    if (n == 1) return base;
    else return (isOdd(n) ? base : 1) * powerN(base * base, n / 2);
  }
  
  boolean isOdd(int num) { return (num & 1) == 1; }
}

