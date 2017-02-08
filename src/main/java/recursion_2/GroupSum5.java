package recursion_2;

import java.util.*;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
 * Source: http://codingbat.com/prob/p138907
 */
public class GroupSum5 {
  public boolean groupSum5(int start, int[] nums, int target) {
    if (start >= nums.length) return (target == 0);
    else if (divides(nums[start], 5)) {
      int newStart = ((start + 1 < nums.length) && (nums[start + 1] == 1)) ? start + 2 : start + 1;
      return groupSum5(newStart, nums, target - nums[start]);
    } else return groupSum5(start + 1, nums, target) 
               || groupSum5(start + 1, nums, target - nums[start]);
  }
  
  boolean divides(int i, int j) { return (j != 0) && (i % j) == 0; }
}

