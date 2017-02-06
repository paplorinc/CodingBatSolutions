package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
 * Source: http://codingbat.com/prob/p109783
 */
public class HaveThree {
  public boolean haveThree(int[] nums) {
    if (nums.length >= 3) {
      int count = (nums[nums.length - 1] == 3) ? 1 : 0;
      for (int i = 1; i < nums.length; i++)
        if (nums[i - 1] == 3) {
          if (nums[i] == 3) return false;
          count++;
        }
      return count == 3;
    }
    return false;
  }
}

