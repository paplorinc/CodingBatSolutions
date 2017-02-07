package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
 * Source: http://codingbat.com/prob/p158175
 */
public class PairStar {
  public String pairStar(String str) {
    if (str.length() <= 1) return str;
    else return str.charAt(0) 
              + ((str.charAt(0) == str.charAt(1)) ? "*" : "")
              + pairStar(str.substring(1));
  }
}

