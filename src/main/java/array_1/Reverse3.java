package array_1;

import java.util.*;

/**
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 * Source: http://codingbat.com/prob/p112409
 */
public class Reverse3 {
  public int[] reverse3(int[] nums) {
    int[] results = new int[nums.length];
    for (int i = 0; i < nums.length; i++)
      results[i] = nums[(nums.length - 1) - i];
    return results;
  }
}

