package logic_1;

import java.util.*;

/**
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
 * Source: http://codingbat.com/prob/p159612
 */
public class Old35 {
  public boolean old35(int n) {
    return (n % 3 == 0 || n % 5 == 0) && n % 15 != 0;
  }
}

