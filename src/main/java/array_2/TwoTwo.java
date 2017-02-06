package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
 * Source: http://codingbat.com/prob/p102145
 */
public class TwoTwo {
  public boolean twoTwo(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++)
      if (nums[i] == 2) count++;
      else if (count == 1) return false;
      else count = 0;
    return count != 1;
  }
}

