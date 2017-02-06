package array_3;

import java.util.*;

/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 * Source: http://codingbat.com/prob/p158767
 */
public class CanBalance {
  public boolean canBalance(int[] nums) {
    int[] sums = new int[nums.length];
    for (int i = 0, sum = 0; i < nums.length; i++) {
      sum += nums[i];
      sums[i] = sum;
    }
    
    for (int i = nums.length - 1, sum = 0; i >= 0; i--) {
      if (sum == sums[i])
        return true;
      sum += nums[i];
    }
    return false;
  }
}

