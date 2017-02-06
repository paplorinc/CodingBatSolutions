package warmup_1;

import java.util.*;

/**
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
 * Source: http://codingbat.com/prob/p136351
 */
public class Front3 {
  public String front3(String str) {
    String prefix = str.substring(0, Math.min(3, str.length()));
    return prefix + prefix + prefix;
  }
}

