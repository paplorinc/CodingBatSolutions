package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
 * Source: http://codingbat.com/prob/p199612
 */
public class Sum28 {
  public boolean sum28(int[] nums) {
    int count = 0;
    for (int num : nums)
      if (num == 2)
        count++;
    return count == 4;
  }
}

