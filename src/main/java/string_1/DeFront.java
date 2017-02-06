package string_1;

import java.util.*;

/**
 * Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
 * Source: http://codingbat.com/prob/p110141
 */
public class DeFront {
  public String deFront(String str) {    
    if (str.isEmpty()) return str;
    StringBuilder result = new StringBuilder(str);
    if (str.charAt(1) != 'b') result.deleteCharAt(1);
    if (str.charAt(0) != 'a') result.deleteCharAt(0);
    return result.toString();
  }
}

