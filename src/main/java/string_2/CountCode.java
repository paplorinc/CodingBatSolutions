package string_2;

import java.util.*;

/**
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 * Source: http://codingbat.com/prob/p123614
 */
public class CountCode {
  public int countCode(String str) {
    String target = "co.e";
    return (str.length() - str.replaceAll(target, "").length()) / target.length();
  }
}

