package recursion_2;

import java.util.*;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
 * Source: http://codingbat.com/prob/p185204
 */
public class SplitArray {
  public boolean splitArray(int[] nums) {
    return canSplitArray(0, 0, nums, 0);  
  }
  
  boolean canSplitArray(int sum1, int sum2, int[] nums, int start) {
    if (start >= nums.length) return (sum1 == sum2);
    else return canSplitArray(sum1 + nums[start], sum2, nums, start + 1)
             || canSplitArray(sum1, sum2 + nums[start], nums, start + 1);
  }
}

