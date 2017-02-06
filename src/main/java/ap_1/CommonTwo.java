package ap_1;

import java.util.*;

/**
 * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
 * Source: http://codingbat.com/prob/p100369
 */
public class CommonTwo {
  public int commonTwo(String[] a, String[] b) {
    int count = 0;
    for (int i = 0, j = 0; i < a.length && j < b.length;) {
      for (String prev = a[i]; i + 1 < a.length && a[i + 1] == prev;)
        i++;
      for (String prev = b[j]; j + 1 < b.length && b[j + 1] == prev;)
        j++;
  
      int comparison = a[i].compareTo(b[j]);
      if (comparison < 0) i++;
      else if (comparison > 0) j++;
      else {
        i++;
        j++;
        count++;
      }
    }
    return count;
  }
}

