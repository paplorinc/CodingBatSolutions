package warmup_2;

import java.util.*;

/**
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
 * Source: http://codingbat.com/prob/p126212
 */
public class StringYak {
  public String stringYak(String str) {
    return str.replaceAll("y.k", "");
  }
}

