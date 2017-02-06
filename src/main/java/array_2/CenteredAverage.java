package array_2;

import java.util.*;

/**
 * Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
 * Source: http://codingbat.com/prob/p136585
 */
public class CenteredAverage {
  public int centeredAverage(int[] nums) {
    int minPos = 0, maxPos = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < nums[minPos]) minPos = i;
      if (nums[i] >= nums[maxPos]) maxPos = i;
    }
    long sum = 0;
    for (int i = 0; i < nums.length; i++)
      if (i != minPos && i != maxPos)
        sum += nums[i];
    return (int) sum / (nums.length - 2);
  }
}

