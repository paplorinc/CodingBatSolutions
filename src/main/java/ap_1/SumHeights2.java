package ap_1;

import java.util.*;

/**
 * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end.
 * Source: http://codingbat.com/prob/p157900
 */
public class SumHeights2 {
  public int sumHeights2(int[] heights, int start, int end) {
    int sum = 0, previous = heights[start];
    for (int i = start + 1; i <= end; i++) {
      int diff = heights[i] - previous;
      if (diff > 0) sum += 2 * diff;
      else sum -= diff;
      
      previous = heights[i];
    }
    return sum;
  }
}

