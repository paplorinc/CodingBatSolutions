package recursion_2;

import java.util.*;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
 * Source: http://codingbat.com/prob/p171660
 */
public class SplitOdd10 {
  public boolean splitOdd10(int[] nums) {
    return split(0, 0, nums, 0);
  }
  
  boolean split(int sum1, int sum2, int[] nums, int start) {
    if (start >= nums.length) 
      return (divides(sum1, 10) && !divides(sum2, 2)) ||  (divides(sum2, 10) && !divides(sum1, 2));
    else return split(sum1 + nums[start], sum2, nums, start + 1)
             || split(sum1, sum2 + nums[start], nums, start + 1);
  }
  
  boolean divides(int i, int j) { return (j != 0) && ((i % j) == 0); }
}

