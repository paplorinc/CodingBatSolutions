package string_1;

import java.util.*;

/**
 * Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
 * Source: http://codingbat.com/prob/p105745
 */
public class MinCat {
  public String minCat(String a, String b) {
    int length = Math.min(a.length(), b.length());
    return a.substring(a.length() - length) + b.substring(b.length() - length, b.length());
  }
}

