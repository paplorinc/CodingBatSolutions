package string_1;

import java.util.*;

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 * Source: http://codingbat.com/prob/p172267
 */
public class FirstHalf {
  public String firstHalf(String str) {
    return str.substring(0, str.length()/2);
  }
}

