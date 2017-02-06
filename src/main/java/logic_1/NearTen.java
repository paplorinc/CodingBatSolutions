package logic_1;

import java.util.*;

/**
 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
 * Source: http://codingbat.com/prob/p193613
 */
public class NearTen {
  public boolean nearTen(int num) {
    int remainder = num % 10;
    return remainder <= 2 || remainder >= 8;
  }
}

