package array_2;

import java.util.*;

/**
 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
 * Source: http://codingbat.com/prob/p105771
 */
public class EvenOdd {
  public int[] evenOdd(int[] nums) {
    List<Integer> evens = new ArrayList<Integer>(nums.length);
    List<Integer> odds = new ArrayList<Integer>(nums.length);
    for (int num : nums)
      if (isOdd(num)) odds.add(num);
      else evens.add(num);
    
    int[] results = new int[nums.length];
    int i = 0;
    for (int num : evens) results[i++] = num;
    for (int num : odds) results[i++] = num;
    return results;
  }
  
  boolean isOdd(int num) { return (num & 1) == 1; }
}

