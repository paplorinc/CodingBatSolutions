package recursion_1;

import java.util.*;

/**
 * Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
 * Source: http://codingbat.com/prob/p104029
 */
public class StringClean {
  public String stringClean(String str) {
    if (str.length() < 2) return str;
    else return ((str.charAt(0) == str.charAt(1)) ? "" : "" + str.charAt(0)) 
              + stringClean(str.substring(1));
  }
}

