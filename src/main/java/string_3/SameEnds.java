package string_3;

import java.util.*;

/**
 * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
 * Source: http://codingbat.com/prob/p131516
 */
public class SameEnds {
  public String sameEnds(String string) {
    return string.replaceAll("^(.*).*?\\1$", "$1");
  }
}

