package array_3;

import java.util.*;

/**
 * Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
 * Source: http://codingbat.com/prob/p189576
 */
public class MaxSpan {
  public int maxSpan(int[] nums) {
    int span = 0;
    Map<Integer, Integer> first = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (!first.containsKey(nums[i])) 
        first.put(nums[i], i);
      span = Math.max(span, (i - first.get(nums[i])) + 1);
    }
    return span;
  }
}

