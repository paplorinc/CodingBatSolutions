package warmup_1;

import java.util.*;

/**
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
 * Source: http://codingbat.com/prob/p112564
 */
public class Or35 {
  public boolean or35(int n) {
    return isDivisible(n, 3) || isDivisible(n, 5);
  }
  
  boolean isDivisible(int num, int factor) {
    return num % factor == 0;
  }
}

