package array_1;

import java.util.*;

/**
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 * Source: http://codingbat.com/prob/p175689
 */
public class No23 {
  public boolean no23(int[] nums) {
    return isAccepted(nums[0]) && isAccepted(nums[1]);
  }
  
  boolean isAccepted(int num) { return num != 2 && num != 3; }
}

