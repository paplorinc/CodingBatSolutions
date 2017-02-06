package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 * Source: http://codingbat.com/prob/p136648
 */
public class No14 {
  public boolean no14(int[] nums) {
    return !contains(nums, 1) || !contains(nums, 4);
  }
  
  boolean contains(int[] nums, int target) {
    for (int num : nums)
      if (num == target)
        return true;
    return false;
  }
}

