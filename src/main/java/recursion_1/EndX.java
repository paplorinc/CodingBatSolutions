package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
 * Source: http://codingbat.com/prob/p105722
 */
public class EndX {
  public String endX(String str) {
    if (str.isEmpty()) return str;
    else if (str.startsWith("x")) return endX(str.substring(1)) + str.charAt(0);
    else return str.charAt(0) + endX(str.substring(1));
  }
}

