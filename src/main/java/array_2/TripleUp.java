package array_2;

import java.util.*;

/**
 * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
 * Source: http://codingbat.com/prob/p137874
 */
public class TripleUp {
  public boolean tripleUp(int[] nums) {
    if (nums.length == 0) return false;
    else {
      int last = nums[0], count = 1;
      for (int num : nums) {
        if (last + 1 == num) {
          if (++count >= 3)
            return true;
        } else count = 1;
        last = num;
      }
      return false;
    }
  }
}

