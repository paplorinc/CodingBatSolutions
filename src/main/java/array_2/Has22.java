package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
 * Source: http://codingbat.com/prob/p121853
 */
public class Has22 {
  public boolean has22(int[] nums) {
    int previous = 0;
    for (int num : nums) {
      if (num == 2 && previous == 2)
        return true;
      previous = num;
    }
    return false;
  }
}

