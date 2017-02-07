package recursion_1;

import java.util.*;

/**
 * Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.
 * Source: http://codingbat.com/prob/p183174
 */
public class NestParen {
  public boolean nestParen(String str) {
    if (str.isEmpty()) return true;
    else if (str.startsWith("(") && str.endsWith(")")) return nestParen(str.substring(1, str.length() - 1));
    else return false;
  }
}

