package warmup_1;

import java.util.*;

/**
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 * Source: http://codingbat.com/prob/p116624
 */
public class Diff21 {
  public int diff21(int n) {
    final int diff = Math.abs(21 - n);
    return (n > 21)
          ? 2 * diff
          : diff;
  }
}

