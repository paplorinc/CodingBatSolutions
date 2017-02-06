package string_2;

import java.util.*;

/**
 * Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
 * Source: http://codingbat.com/prob/p159772
 */
public class XyzMiddle {
  public boolean xyzMiddle(String str) {
    if (str.length() < 3) return false;
    else {
      String target = "xyz";
      int diff = str.length() - target.length();
      int start = diff / 2;
      return target.equals(str.substring(start, start + target.length()))
| ((diff % 2 != 0) && target.equals(str.substring(start + 1, start + 1+ target.length())));
    }
  }
}

