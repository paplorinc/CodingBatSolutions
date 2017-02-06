package ap_1;

import java.util.*;

/**
 * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.
 * Source: http://codingbat.com/prob/p130124
 */
public class CopyEndy {
  public int[] copyEndy(int[] nums, int count) {
    int[] result = new int[count];
    for (int i = 0, j = 0; j < count && i < nums.length; i++)
      if (isEndy(nums[i]))
        result[j++] = nums[i];
    return result;
  }
  
  boolean isEndy(int num) {
    return (num <= 10) || (90 <= num && num <= 100);
  }
}

