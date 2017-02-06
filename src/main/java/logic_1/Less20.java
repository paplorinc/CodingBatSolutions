package logic_1;

import java.util.*;

/**
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
 * Source: http://codingbat.com/prob/p133158
 */
public class Less20 {
  public boolean less20(int n) {
    int remainder = n % 20;
    return remainder == 18 || remainder == 19;
  }
}

