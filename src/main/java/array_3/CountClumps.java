package array_3;

import java.util.*;

/**
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
 * Source: http://codingbat.com/prob/p193817
 */
public class CountClumps {
  public int countClumps(int[] nums) {
    int clumps = 0;
    for (int i = 0; i < nums.length;) {
      int adjacent = countAdjacents(nums, i);
      if (adjacent > 1)
        clumps++;
      i += adjacent;
    }
    return clumps;
  }
  
  int countAdjacents(int[] nums, int i) {
    int j = i;
    while ((j + 1 < nums.length) && (nums[j] == nums[j + 1]))
      j++;
    return j - i + 1;
  }
}

