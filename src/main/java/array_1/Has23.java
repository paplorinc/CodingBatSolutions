package array_1;

import java.util.*;

/**
 * Given an int array length 2, return true if it contains a 2 or a 3.
 * Source: http://codingbat.com/prob/p171022
 */
public class Has23 {
  public boolean has23(int[] nums) {
    return isAccepted(nums[0]) || isAccepted(nums[1]);
  }
  
  boolean isAccepted(int num) { return num == 2 || num == 3; }
}

