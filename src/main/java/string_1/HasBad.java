package string_1;

import java.util.*;

/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 * Source: http://codingbat.com/prob/p139075
 */
public class HasBad {
  public boolean hasBad(String str) {
    int index = str.indexOf("bad");
    return index == 0 || index == 1;
  }
}

