package string_1;

import java.util.*;

/**
 * Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
 * Source: http://codingbat.com/prob/p142247
 */
public class Without2 {
  public String without2(String str) {
    if (str.length() <= 1) return str;
    else {
      String prefix = str.substring(0, 2);
      String suffix = str.substring(str.length() - 2);
      if (prefix.equals(suffix))
        return str.substring(2);
      else
      return str;
    }
  }
}

