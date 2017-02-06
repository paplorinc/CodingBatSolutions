package array_3;

import java.util.*;

/**
 * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
 * Source: http://codingbat.com/prob/p159339
 */
public class Fix34 {
  public int[] fix34(int[] nums) {
    int[] result = nums.clone();
    for (int i = 0, j = 0; i + 1 < result.length; i++)
      if (result[i] == 3) {
        for (; j < result.length; j++)
          if (result[j] == 4)
            break;
        swap(result, i + 1, j++);
      }
    return result;
  }
  
  void swap(int[] nums, int i, int j) {
    int copy = nums[i];
    nums[i] = nums[j];
    nums[j] = copy;
  }
}

