package ap_1;

import java.util.*;

/**
 * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.
 * Source: http://codingbat.com/prob/p197710
 */
public class BigHeights {
  public int bigHeights(int[] heights, int start, int end) {
    int steps = 0, previous = heights[start];
    for (int i = start + 1; i <= end; i++) {
      int diff = Math.abs(heights[i] - previous);
      if (diff >= 5)
        steps++;
      previous = heights[i];
    }
    return steps;
  
  }
}

