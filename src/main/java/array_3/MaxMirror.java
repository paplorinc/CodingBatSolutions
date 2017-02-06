package array_3;

import java.util.*;

/**
 * We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
 * Source: http://codingbat.com/prob/p196409
 */
public class MaxMirror {
  public int maxMirror(int[] nums) {
    int max = 0;
    for (int i = 0; i + max < nums.length; i++)
      for (int j = max; j < nums.length; j++)
        max = Math.max(max, maxMirror(nums, i, j));
    return max;
  }
  
  int maxMirror(int[] nums, int i, int j) {
    int count = 0;
    while ((i < nums.length) && (j >= 0) && (nums[i] == nums[j])) {
      i++;
      j--;
      count++;
    }
    return count;
  }
}

