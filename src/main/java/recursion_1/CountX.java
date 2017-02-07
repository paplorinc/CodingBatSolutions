package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 * Source: http://codingbat.com/prob/p170371
 */
public class CountX {
  public int countX(String str) {
    if (str.isEmpty()) return 0;
    else return (str.startsWith("x") ? 1 : 0) + countX(str.substring(1));
  }
}

