package logic_1;

import java.util.*;

/**
 * Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
 * Source: http://codingbat.com/prob/p154188
 */
public class InOrder {
  public boolean inOrder(int a, int b, int c, boolean bOk) {
    return c > b && (bOk || b > a);
  }
}

