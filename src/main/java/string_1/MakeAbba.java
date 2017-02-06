package string_1;

import java.util.*;

/**
 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
 * Source: http://codingbat.com/prob/p161056
 */
public class MakeAbba {
  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }
}

