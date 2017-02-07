package recursion_1;

import java.util.*;

/**
 * Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
 * Source: http://codingbat.com/prob/p195413
 */
public class StrDist {
  public int strDist(String str, String sub) {
    if (str.length() < sub.length())
      return 0;
    else if (!str.startsWith(sub))
      return strDist(str.substring(1), sub);
    else if (!str.endsWith(sub))
      return strDist(str.substring(0, str.length() - 1), sub);
    else return str.length();
  }
}

