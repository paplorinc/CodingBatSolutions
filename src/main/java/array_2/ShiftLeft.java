package array_2;

import java.util.*;

/**
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
 * Source: http://codingbat.com/prob/p105031
 */
public class ShiftLeft {
  public int[] shiftLeft(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++)
      result[(i + nums.length - 1) % nums.length] = nums[i];
    return result;
  }
}

