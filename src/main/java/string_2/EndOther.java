package string_2;

import java.util.*;

/**
 * Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
 * Source: http://codingbat.com/prob/p126880
 */
public class EndOther {
  public boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    return a.endsWith(b) || b.endsWith(a);
  }
}

