package array_1;

import java.util.*;

/**
 * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
 * Source: http://codingbat.com/prob/p118976
 */
public class SameFirstLast {
  public boolean sameFirstLast(int[] nums) {
    return nums.length >= 1 && nums[0] == nums[nums.length - 1];
  }
}

