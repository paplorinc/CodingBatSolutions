package warmup_2;

import java.util.*;

/**
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 * Source: http://codingbat.com/prob/p167430
 */
public class Has271 {
  public boolean has271(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++)
      if ((nums[i + 1] == nums[i] + 5) && (Math.abs((nums[i] - 1) - nums[i+2]) <= 2))
        return true;
    return false;
  }
}

