package array_2;

import java.util.*;

/**
 * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
 * Source: http://codingbat.com/prob/p199484
 */
public class TenRun {
  public int[] tenRun(int[] nums) {
    if (nums.length == 0) return nums;
    else {
      boolean found = isRoundDecimal(nums[0]);
  
      int[] result = new int[nums.length];
      result[0] = nums[0];
      
      for (int i = 1; i < nums.length; i++)
        if (isRoundDecimal(nums[i])) {
          result[i] = nums[i];
          found = true;
        } else
          result[i] = found ? result[i - 1] : nums[i];
      return result;
    }
  }
  
  boolean isRoundDecimal(int num) { return (num % 10) == 0; }
}

