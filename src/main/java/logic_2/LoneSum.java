package logic_2;

import java.util.*;

/**
 * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
 * Source: http://codingbat.com/prob/p148972
 */
public class LoneSum {
  public int loneSum(int a, int b, int c) {
    Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
    for (Integer v : new int[]{a, b, c}) {
      if (counts.containsKey(v)) counts.put(v, counts.get(v) + 1);
      else counts.put(v, 1);
    }
    int count = 0;
    for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
      if (entry.getValue() == 1)
        count += entry.getKey();
    }
    return count;
  }
}

