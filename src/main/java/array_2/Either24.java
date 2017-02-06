package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
 * Source: http://codingbat.com/prob/p191878
 */
public class Either24 {
  public boolean either24(int[] nums) {
    return adjecent(nums, 2) != adjecent(nums, 4);
  }
  
  boolean adjecent(int[] nums, int num) {
    for (int i = 1; i < nums.length; i++)
      if (nums[i - 1] == num && nums[i] == num)
        return true;
    return false;
  }
}

