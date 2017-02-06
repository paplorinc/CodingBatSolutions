package ap_1;

import java.util.*;

/**
 * Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.
 * Source: http://codingbat.com/prob/p140485
 */
public class ScoresSpecial {
  public int scoresSpecial(int[] a, int[] b) {
    return largestSpecialScore(a) + largestSpecialScore(b);
  }
  
  boolean isSpecial(int num) { return (num % 10) == 0; }
  int largestSpecialScore(int[] nums) {
    int result = 0;
    for (int num : nums)
      if (isSpecial(num))
        result = Math.max(result, num);
    return result;
  }
}

