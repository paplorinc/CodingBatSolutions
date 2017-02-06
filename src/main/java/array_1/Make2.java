package array_1;

import java.util.*;

/**
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
 * Source: http://codingbat.com/prob/p143461
 */
public class Make2 {
  public int[] make2(int[] a, int[] b) {
    int[] result = new int[2];
    for (int i = 0; i < Math.min(2, a.length); i++)
      result[i] = a[i];
    if (a.length < 2)
      for (int i = 0; i < 2 - a.length; i++)
        result[a.length + i] = b[i];
  
    return result;
  }
}

