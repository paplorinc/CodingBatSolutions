package warmup_1;

import java.util.*;

/**
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 * Source: http://codingbat.com/prob/p172021
 */
public class Close10 {
  public int close10(int a, int b) {
    int diffA = Math.abs(10 - a);
    int diffB = Math.abs(10 - b);
    if (diffA == diffB) return 0;
    else return (diffA < diffB) ? a : b;
  }
}

