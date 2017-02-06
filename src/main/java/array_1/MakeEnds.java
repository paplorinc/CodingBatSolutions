package array_1;

import java.util.*;

/**
 * Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
 * Source: http://codingbat.com/prob/p101230
 */
public class MakeEnds {
  public int[] makeEnds(int[] nums) {
    return new int[]{nums[0], nums[nums.length - 1]};
  }
}

