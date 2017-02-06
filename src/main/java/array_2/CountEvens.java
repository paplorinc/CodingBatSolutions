package array_2;

import java.util.*;

/**
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 * Source: http://codingbat.com/prob/p162010
 */
public class CountEvens {
  public int countEvens(int[] nums) {
    int count = 0;
    for (int num : nums)
      if (isEven(num))
        count++;
    return count;
  }
  
  boolean isEven(int num) { return (num & 1) == 0; }
}

