package logic_1;

import java.util.*;

/**
 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
 * Source: http://codingbat.com/prob/p153748
 */
public class ShareDigit {
  public boolean shareDigit(int a, int b) {
    Set<Integer> digits = new HashSet<Integer>();
    digits.add(tens(a));
    digits.add(ones(a));
    
    return digits.contains(tens(b)) || digits.contains(ones(b));
  }
  
  int tens(int num) { return num / 10 % 10; }
  int ones(int num) { return num % 10; }
}

