package array_1;

import java.util.*;

/**
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
 * Source: http://codingbat.com/prob/p128270
 */
public class Front11 {
  public int[] front11(int[] a, int[] b) {
    if (a.length == 0 && b.length == 0) return new int[0];
    else if (a.length == 0) return new int[]{b[0]};
    else if (b.length == 0) return new int[]{a[0]};
    else return new int[]{a[0], b[0]};
  }
}

