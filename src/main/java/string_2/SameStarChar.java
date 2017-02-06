package string_2;

import java.util.*;

/**
 * Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
 * Source: http://codingbat.com/prob/p194491
 */
public class SameStarChar {
  public boolean sameStarChar(String str) {
    for (int i = 1; i < str.length() - 1; i++)
      if (str.charAt(i) == '*')
        if (str.charAt(i - 1) != str.charAt(i + 1))
          return false;
    return true;
  }
}

