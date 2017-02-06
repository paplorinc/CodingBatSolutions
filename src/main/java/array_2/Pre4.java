package array_2;

import java.util.*;

/**
 * Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 * Source: http://codingbat.com/prob/p100246
 */
public class Pre4 {
  public int[] pre4(int[] nums) {
    int index = indexOf(nums, 4);
    int[] result = new int[index];
    for (int i = 0; i < result.length; i++)
      result[i] = nums[i];
    return result;
  }
  
  int indexOf(int[] nums, int num) {
    for (int i = 0; i < nums.length; i++)
      if (nums[i] == num)
        return i;
    throw new IllegalStateException();
  }
}

