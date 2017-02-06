package array_2;

import java.util.*;

/**
 * Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
 * Source: http://codingbat.com/prob/p187050
 */
public class ZeroMax {
  public int[] zeroMax(int[] nums) {
    int[] result = nums.clone();
    for (int i = nums.length - 1, max = 0; i >= 0; i--)
      if (isOdd(nums[i])) max = Math.max(nums[i], max);
      else if (nums[i] == 0) result[i] = max;
    return result;
  }
  boolean isOdd(int num) { return (num & 1) == 1; }
}

