package warmup_2;

import java.util.*;

/**
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 * Source: http://codingbat.com/prob/p136041
 */
public class Array123 {
  public boolean array123(int[] nums) {
    int[] search = {1, 2, 3};
    for(int i = 0; i < nums.length; i++)
      if (startsWith (nums, i, search))
        return true;
    return false;
  }
  
  boolean startsWith(int[] source, int offset, int[] target) {
    int length = Math.min(source.length - offset, target.length);
    for(int i = 0; i < length; i++)
      if (source[offset + i] != target[i])
        return false;
    return length >= target.length;
  }
}

