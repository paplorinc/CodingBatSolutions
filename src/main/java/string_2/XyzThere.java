package string_2;

import java.util.*;

/**
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 * Source: http://codingbat.com/prob/p136594
 */
public class XyzThere {
  public boolean xyzThere(String str) {
    return str.matches(".*(?<!\\.)xyz.*");
  }
}

