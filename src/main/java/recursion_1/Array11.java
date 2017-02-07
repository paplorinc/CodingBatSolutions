package recursion_1;

import java.util.*;

/**
 * Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
 * Source: http://codingbat.com/prob/p135988
 */
public class Array11 {
  public int array11(int[] nums, int i) {
    if (i >= nums.length) return 0;
    else return ((nums[i] == 11) ? 1 : 0) + array11(nums, i + 1);
  }
}

