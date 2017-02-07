package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
 * Source: http://codingbat.com/prob/p183394
 */
public class AllStar {
  public String allStar(String str) {
    if (str.length() <= 1) return str;
    else return str.charAt(0) + "*" + allStar(str.substring(1));
  }
}

