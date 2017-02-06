package array_1;

import java.util.*;

/**
 * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
 * Source: http://codingbat.com/prob/p185176
 */
public class MaxTriple {
  public int maxTriple(int[] nums) {
    return Math.max(Math.max(nums[0], nums[nums.length / 2]), nums[nums.length - 1]);
  }
}

