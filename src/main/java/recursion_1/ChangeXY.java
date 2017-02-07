package recursion_1;

import java.util.*;

/**
 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
 * Source: http://codingbat.com/prob/p101372
 */
public class ChangeXY {
  public String changeXY(String str) {
    if (str.length() <= 1) return "x".equals(str) ? "y" : str;
    else return changeXY(str.substring(0, 1)) + changeXY(str.substring(1));
  }
}

