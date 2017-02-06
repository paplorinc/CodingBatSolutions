package array_1;

import java.util.*;

/**
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 * Source: http://codingbat.com/prob/p197308
 */
public class Unlucky1 {
  public boolean unlucky1(int[] nums) {
    return (nums.length > 1) && (isUnlucky(nums, 0) || isUnlucky(nums, 1) ||  isUnlucky(nums, nums.length - 2) || isUnlucky(nums, nums.length - 1));
  }
  
  boolean isUnlucky(int[] nums, int i) { return (i + 1 < nums.length) && (nums[i] == 1) && (nums[i + 1] == 3); }
}

