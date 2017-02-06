package array_1;

import java.util.*;

/**
 * Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
 * Source: http://codingbat.com/prob/p118044
 */
public class SwapEnds {
  public int[] swapEnds(int[] nums) {
    int[] results = nums.clone();
    swap(results, 0, nums.length - 1);
    return results;
  }
  
  void swap(int[] array, int i, int j) {
    int copy = array[i];
    array[i] = array[j];
    array[j] = copy;
  }
}

