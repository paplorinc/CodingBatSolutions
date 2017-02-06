package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
 * Source: http://codingbat.com/prob/p169260
 */
public class Has12 {
  public boolean has12(int[] nums) {
    boolean found = false;
    for (int num : nums)
      if (num == 1) found = true;
      else if (found && num == 2) return true;
    return false;
  }
}

