package string_3;

import java.util.*;

/**
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
 * Source: http://codingbat.com/prob/p198664
 */
public class GHappy {
  public boolean gHappy(String str) {
    if ((str.startsWith("g") && !str.startsWith("gg"))
| (str.endsWith("g") && !str.endsWith("gg")))
      return false;
    else {
      for (int i = 1; i < str.length() - 1; i++)
        if (str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g'))
            return false;
      return true;
    }
  }
}

