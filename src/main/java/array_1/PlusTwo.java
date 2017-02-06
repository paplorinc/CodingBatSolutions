package array_1;

import java.util.*;

/**
 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
 * Source: http://codingbat.com/prob/p180840
 */
public class PlusTwo {
  public int[] plusTwo(int[] a, int[] b) {
    int[] results = new int[a.length + b.length];
    for (int i = 0; i < a.length; i++)
      results[i] = a[i];
    for (int i = 0; i < b.length; i++)
      results[a.length + i] = b[i];
    return results;
  }
}

