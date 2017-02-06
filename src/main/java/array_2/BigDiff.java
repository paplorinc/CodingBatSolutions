package array_2;

import java.util.*;

/**
 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
 * Source: http://codingbat.com/prob/p196640
 */
public class BigDiff {
  public int bigDiff(int[] nums) {
    int min = nums[0], max = nums[0];
    for (int num : nums) {
      min = Math.min(min, num);
      max = Math.max(max, num);
    }
    return max - min;
  }
}

