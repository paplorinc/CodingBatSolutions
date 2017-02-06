package array_1;

import java.util.*;

/**
 * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
 * Source: http://codingbat.com/prob/p199519
 */
public class MakeMiddle {
  public int[] makeMiddle(int[] nums) {
    int mid = nums.length / 2 - 1;
    return new int[]{nums[mid], nums[mid + 1]};
  }
}

