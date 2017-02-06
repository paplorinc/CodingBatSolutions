package string_1;

import java.util.*;

/**
 * Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 * Source: http://codingbat.com/prob/p132118
 */
public class ConCat {
  public String conCat(String a, String b) {
    if (a.isEmpty()) return b;
    else if (b.isEmpty()) return a;
    else { 
      char last = a.charAt(a.length() - 1);
      char first = b.charAt(0);
      return a + ((last == first) ? b.substring(1) : b);
    }
  }
}

