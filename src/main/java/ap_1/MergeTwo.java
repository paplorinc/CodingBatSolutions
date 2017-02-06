package ap_1;

import java.util.*;

/**
 * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
 * Source: http://codingbat.com/prob/p139150
 */
public class MergeTwo {
  public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] result = new String[n];
    for (int i = 0, j = 0, r = 0; r < n;) {
      String val = (a[i].compareTo(b[j]) < 0) ? a[i++] : b[j++];
      if ((r == 0) || (val != result[r - 1]))
        result[r++] = val;
    }
    return result;
  }
}

