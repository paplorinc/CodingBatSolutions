package warmup_2;

import java.util.*;

/**
 * Given an array of ints, return the number of 9's in the array.
 * Source: http://codingbat.com/prob/p184031
 */
public class ArrayCount9 {
  public int arrayCount9(int[] nums) {
    int count = 0;
    for (int num : nums)
      if (num == 9)
      count++;
    return count;
  }
}

