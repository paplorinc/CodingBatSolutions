package ap_1;

import java.util.*;

/**
 * Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.
 * Source: http://codingbat.com/prob/p134174
 */
public class CopyEvens {
  public int[] copyEvens(int[] nums, int count) {
    int[] result = new int[count];
    for (int i = 0, j = 0; j < count && i < nums.length; i++)
      if (isEven(nums[i]))
        result[j++] = nums[i];
    return result;
  }
  
  boolean isEven(int num) { return (num % 2) == 0; }
}

