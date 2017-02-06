package warmup_1;

import java.util.*;

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
 * Source: http://codingbat.com/prob/p165701
 */
public class LoneTeen {
  public boolean loneTeen(int a, int b) {
    return isTeen(a) != isTeen(b);
  }
  
  boolean isTeen(int age){
    return 13 <= age && age <= 19;
  }
}

