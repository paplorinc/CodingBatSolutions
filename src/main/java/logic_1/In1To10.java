package logic_1;

import java.util.*;

/**
 * Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
 * Source: http://codingbat.com/prob/p137365
 */
public class In1To10 {
  public boolean in1To10(int n, boolean outsideMode) {
    if (n == 1 || n == 10) return true;
    else return outsideMode != containsExclusive(n);
  }
  
  boolean containsExclusive(int n) { return 1 < n && n < 10;}
}

