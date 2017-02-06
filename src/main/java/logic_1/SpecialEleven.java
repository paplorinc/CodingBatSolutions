package logic_1;

import java.util.*;

/**
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
 * Source: http://codingbat.com/prob/p100962
 */
public class SpecialEleven {
  public boolean specialEleven(int n) {
    return n % 11 <= 1;
  }
}

