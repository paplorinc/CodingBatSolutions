package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
 * Source: http://codingbat.com/prob/p159979
 */
public class ModThree {
  public boolean modThree(int[] nums) {
    if (nums.length >= 3) {
      for (int i = 2; i < nums.length; i++) {
        boolean n1 = isEven(nums[i - 2]);
        boolean n2 = isEven(nums[i - 1]);
        boolean n3 = isEven(nums[i]);
        if (n1 == n2 && n2 == n3)
          return true;
      }
    }
    return false;
  }
  
  boolean isEven(int num) { return (num & 1) == 0; }
}

