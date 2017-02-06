package array_2;

import java.util.*;

/**
 * Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 * Source: http://codingbat.com/prob/p164144
 */
public class Post4 {
  public int[] post4(int[] nums) {
    int index = lastIndexOf(nums, 4);
    int[] result = new int[(nums.length - 1) - index];
    for (int i = index + 1; i < nums.length; i++)
      result[i - (index + 1) ] = nums[i];
    return result;
  }
  
  int lastIndexOf(int[] nums, int num) {
    for (int i = nums.length - 1; i >= 0; i--)
      if (nums[i] == num)
        return i;
    throw new IllegalStateException();
  }
}

