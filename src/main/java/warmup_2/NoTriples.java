package warmup_2;

import java.util.*;

/**
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 * Source: http://codingbat.com/prob/p170221
 */
public class NoTriples {
  public boolean noTriples(int[] nums) {
    for(int i = 0; i < nums.length - 2; i++)
      if ((nums[i] == nums[i + 1]) && (nums[i] == nums[i + 2]))
        return false;
    return true;
  }
}

