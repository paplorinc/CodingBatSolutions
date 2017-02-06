package logic_1;

import java.util.*;

/**
 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 * Source: http://codingbat.com/prob/p169213
 */
public class LastDigit {
  public boolean lastDigit(int a, int b, int c) {
    Set<Integer> digits = new HashSet<Integer>();
    digits.add(a % 10);
    digits.add(b % 10);
    digits.add(c % 10);
    return digits.size() <= 2;
  }
}

