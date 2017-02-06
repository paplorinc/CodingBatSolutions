package logic_2;

import java.util.*;

/**
 * We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
 * Source: http://codingbat.com/prob/p191363
 */
public class MakeChocolate {
  public int makeChocolate(int small, int big, int goal) {
    int smallBoxSize = 1, bigBoxSize = 5;
    int bigCount = Math.min(big, goal / bigBoxSize);
    int smallCount = (goal - (bigBoxSize * bigCount)) / smallBoxSize;
    return (small >= smallCount) ? smallCount : -1;
  }
}

