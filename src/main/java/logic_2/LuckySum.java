package logic_2;

import java.util.*;

/**
 * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
 * Source: http://codingbat.com/prob/p130788
 */
public class LuckySum {
  public int luckySum(int a, int b, int c) {
    int count = 0;
    for (int v : new int[]{a, b, c})
      if (v == 13) break;
      else count += v;
    return count;
  }
}

