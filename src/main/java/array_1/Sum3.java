package array_1;

import java.util.*;

/**
 * Given an array of ints length 3, return the sum of all the elements.
 * Source: http://codingbat.com/prob/p175763
 */
public class Sum3 {
  public int sum3(int[] nums) {
    int count = 0;
    for (int num : nums)
      count += num;
    return count;
  }
}

