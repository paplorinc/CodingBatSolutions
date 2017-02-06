package warmup_2;

import java.util.*;

/**
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
 * Source: http://codingbat.com/prob/p171260
 */
public class StringX {
  public String stringX(String str) {
      StringBuilder result = new StringBuilder(str);
      for(int i = str.length() - 2; i > 0; i--)
          if (result.charAt(i) == 'x')
              result.deleteCharAt(i);
      return result.toString();
  }
}

