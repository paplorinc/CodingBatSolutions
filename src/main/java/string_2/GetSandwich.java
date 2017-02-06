package string_2;

import java.util.*;

/**
 * A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
 * Source: http://codingbat.com/prob/p129952
 */
public class GetSandwich {
  public String getSandwich(String str) {
    String s = "bread";
    int firstEnd = str.indexOf(s) + s.length();
    int lastStart = str.lastIndexOf(s);
    return (lastStart < firstEnd) ? "" : str.substring(firstEnd, lastStart);
  }
}

