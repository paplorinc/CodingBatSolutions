package array_1;

import java.util.*;

/**
 * Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
 * Source: http://codingbat.com/prob/p146256
 */
public class MaxEnd3 {
  public int[] maxEnd3(int[] nums) {
    int max = Math.max(nums[0], nums[nums.length - 1]);
    int[] results = nums.clone();
    for (int i = 0; i < nums.length; i++)
      results[i] = max;
    return results;
  }
}

