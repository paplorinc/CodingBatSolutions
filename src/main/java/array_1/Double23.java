package array_1;

import java.util.*;

/**
 * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
 * Source: http://codingbat.com/prob/p145365
 */
public class Double23 {
  public boolean double23(int[] nums) {
    Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
    for (int num : nums) {
      if (!counts.containsKey(num))
        counts.put(num, 1);   
      else counts.put(num, counts.get(num) + 1);
    }
    return new Integer(2).equals(counts.get(2)) || new Integer(2).equals(counts.get(3));
  }
}

