package warmup_1;

import java.util.*;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
 * Source: http://codingbat.com/prob/p178986
 */
public class HasTeen {
  public boolean hasTeen(int a, int b, int c) {
    return isTeen(a) || isTeen(b) || isTeen(c);
  }
  
  boolean isTeen(int age) {
    return 13 <= age && age <= 19;
  }
}

