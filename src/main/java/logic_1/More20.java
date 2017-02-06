package logic_1;

import java.util.*;

/**
 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
 * Source: http://codingbat.com/prob/p118290
 */
public class More20 {
  public boolean more20(int n) {
    int remainder = n % 20;
    return remainder == 1 || remainder == 2;
  }
}

