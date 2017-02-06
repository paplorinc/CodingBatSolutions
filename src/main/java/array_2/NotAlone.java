package array_2;

import java.util.*;

/**
 * We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
 * Source: http://codingbat.com/prob/p169506
 */
public class NotAlone {
  public int[] notAlone(int[] nums, int val) {
    int[] result = nums.clone();
    for (int i = 1; i + 1 < nums.length; i++)
      if ((nums[i] == val) && isAlone(nums, i)) {
        result[i] = Math.max(nums[i - 1], nums[i + 1]);
      }
    return result;
  }
  
  boolean isAlone(int[] nums, int index) { 
    return (nums.length >= 3)
        && (index > 0) && (nums[index] != nums[index - 1]) 
        && (index + 1 < nums.length) && (nums[index] != nums[index + 1]);
  }
}

