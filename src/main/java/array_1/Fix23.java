package array_1;

import java.util.*;

/**
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
 * Source: http://codingbat.com/prob/p120347
 */
public class Fix23 {
  public int[] fix23(int[] nums) {
    int[] results = nums.clone();
    for (int i = 0; i < results.length - 1; i++)
      if (results[i] == 2 && results[i + 1] == 3)
        results[i + 1] = 0;
    return results;
  }
}

