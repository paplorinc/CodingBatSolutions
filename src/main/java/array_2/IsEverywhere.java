package array_2;

import java.util.*;

/**
 * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.
 * Source: http://codingbat.com/prob/p110222
 */
public class IsEverywhere {
  public boolean isEverywhere(int[] nums, int val) {
    for (int i = 1; i < nums.length; i++)
      if (nums[i - 1] != val && nums[i] != val)
        return false;
    return true;
  }
}

