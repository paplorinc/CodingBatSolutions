package string_3;

import java.util.*;

/**
 * We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
 * Source: http://codingbat.com/prob/p195714
 */
public class CountTriple {
  public int countTriple(String str) {
    int count = 0;
    for (int i = 1; i + 1 < str.length(); i++)
      if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i) == str.charAt(i + 1))
        count++;
    return count;
  }
}

