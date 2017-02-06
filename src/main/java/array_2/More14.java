package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if the number of 1's is greater than the number of 4's
 * Source: http://codingbat.com/prob/p104627
 */
public class More14 {
  public boolean more14(int[] nums) {
    int balance = 0;
    for (int num : nums)
      if (num == 1) balance++;
      else if (num == 4) balance--;
    return balance > 0;
  }
}

