package recursion_1;

import java.util.*;

/**
 * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
 * Source: http://codingbat.com/prob/p173469
 */
public class Array220 {
  public boolean array220(int[] nums, int index) {
    return (index + 1 < nums.length) 
        && ((nums[index + 1] == 10 * nums[index]) || (array220(nums, index + 1)));
  }
}

