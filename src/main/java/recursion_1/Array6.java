package recursion_1;

import java.util.*;

/**
 * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
 * Source: http://codingbat.com/prob/p108997
 */
public class Array6 {
  public boolean array6(int[] nums, int index) {
    return (index < nums.length) && ((nums[index] == 6) || array6(nums, index + 1));
  }
}

