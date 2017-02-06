package array_1;

import java.util.*;

/**
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 * Source: http://codingbat.com/prob/p185139
 */
public class RotateLeft3 {
  public int[] rotateLeft3(int[] nums) {
    int[] results = new int[nums.length];
    int offset = nums.length - 1;
    for (int i = 0; i < nums.length; i++)
      results[(i + offset) % nums.length] = nums[i];
    return results;
  }
}

