package ap_1;

import java.util.*;

/**
 * Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
 * Source: http://codingbat.com/prob/p123837
 */
public class ScoresAverage {
  public int scoresAverage(int[] scores) {
    int mid = scores.length / 2;
    int first = average(scores, 0, mid - 1);
    int second = average(scores, mid, scores.length - 1); 
    return Math.max(first, second);
  }
  
  int average(int[] nums, int from, int to) {
    long sum = 0;
    for (int i = from; i <= to; i++)
      sum += nums[i];
    return (int) (sum / (to - from + 1));
  }
}

