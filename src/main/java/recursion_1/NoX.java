package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
 * Source: http://codingbat.com/prob/p118230
 */
public class NoX {
  public String noX(String str) {
    if (str.isEmpty()) return str;
    else return (str.startsWith("x") ? "" : str.substring(0, 1)) + noX(str.substring(1));
  }
}

