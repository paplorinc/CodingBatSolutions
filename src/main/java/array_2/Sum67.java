package array_2;

import java.util.*;

/**
 * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
 * Source: http://codingbat.com/prob/p111327
 */
public class Sum67 {
  public int sum67(int[] nums) {
    int sum = 0;
    boolean marked = false;
    for (int num : nums) {
      if (num == 6) marked = true;
      if (!marked) sum += num;
      if (num == 7) marked = false;
    }
    return sum;
  }
}

