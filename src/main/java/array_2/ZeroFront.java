package array_2;

import java.util.*;

/**
 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 * Source: http://codingbat.com/prob/p193753
 */
public class ZeroFront {
  public int[] zeroFront(int[] nums) {
    int[] result = nums.clone();
    for (int i = 0, j = 0; i < nums.length; i++)
      if (nums[i] == 0)
        swap(result, i, j++);
    return result;
  }
  
  void swap(int[] nums, int i, int j) {
    int copy = nums[i];
    nums[i] = nums[j];
    nums[j] = copy;
  }
}

