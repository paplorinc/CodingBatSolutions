package warmup_1;

import java.util.*;

/**
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 * Source: http://codingbat.com/prob/p191914
 */
public class NotString {
  public String notString(String str) {
    if (str.startsWith("not"))
      return str;
    else
      return "not " + str;
  }
}

