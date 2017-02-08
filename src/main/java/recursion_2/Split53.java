package recursion_2;

import java.util.*;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
 * Source: http://codingbat.com/prob/p168295
 */
public class Split53 {
  public boolean split53(int[] nums) {
    return split(0, 0, nums, 0);
  }
  
  boolean split(int sum1, int sum2, int[] nums, int start) {
    if (start >= nums.length) return (sum1 == sum2);
    else {
      if (divides(nums[start], 5))
          return split(sum1 + nums[start], sum2, nums, start + 1);
      else if (divides(nums[start], 3))
        return split(sum1, sum2 + nums[start], nums, start + 1);
      else 
        return split(sum1 + nums[start], sum2, nums, start + 1)
            || split(sum1, sum2 + nums[start], nums, start + 1);
    }
  }
  
  boolean divides(int i, int j) { return (j != 0) && ((i % j) == 0); }
}

