package array_2;

import java.util.*;

/**
 * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
 * Source: http://codingbat.com/prob/p168357
 */
public class Has77 {
  public boolean has77(int[] nums) {
    if (nums.length > 2) {
      for (int i = 2; i < nums.length; i++) {
        int count = 0;
        for (int j = 0; j < 3; j++)
          if (nums[i - j] == 7)
            count++;
        if (count >= 2)
          return true;
      }
    }
    return false;
  }
}

