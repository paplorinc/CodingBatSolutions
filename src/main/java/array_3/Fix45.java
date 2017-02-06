package array_3;

import java.util.*;

/**
 * (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.
 * Source: http://codingbat.com/prob/p125819
 */
public class Fix45 {
  public int[] fix45(int[] nums) {
  for(int i = 0, j = 0; i + 1 < nums.length; i++) {
  if(nums[i] == 4 && nums[i + 1] != 5) {
  while((nums[Math.max(0, j - 1)] == 4) || (nums[j] != 5))
    j++;
  swap(nums, i + 1, j);
  }
  }
  return nums;
  }
  
  void swap(int[] nums, int i, int j) {
    int copy = nums[i];
    nums[i] = nums[j];
    nums[j] = copy;
  }
}

