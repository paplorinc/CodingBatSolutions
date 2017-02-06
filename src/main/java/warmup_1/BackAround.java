package warmup_1;

import java.util.*;

/**
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 * Source: http://codingbat.com/prob/p161642
 */
public class BackAround {
  public String backAround(String str) {
    if (str.length() == 0) return str;
    else {
      char last = str.charAt(str.length() - 1);
      return last + str + last;
    }
  }
}

