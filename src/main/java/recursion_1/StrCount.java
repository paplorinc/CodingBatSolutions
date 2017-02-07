package recursion_1;

import java.util.*;

/**
 * Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
 * Source: http://codingbat.com/prob/p186177
 */
public class StrCount {
  public int strCount(String str, String sub) {
    if (str.length() < sub.length()) return 0;
    else if (str.startsWith(sub)) return  1 + strCount(str.substring(sub.length()), sub);
    else return strCount(str.substring(1), sub);
  }
}

