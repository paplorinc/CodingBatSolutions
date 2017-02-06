package array_1;

import java.util.*;

/**
 * Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 * Source: http://codingbat.com/prob/p137188
 */
public class MakeLast {
  public int[] makeLast(int[] nums) {
    int[] results = new int[2 * nums.length];
    results[results.length - 1] = nums[nums.length - 1];
    return results;
  }
}

