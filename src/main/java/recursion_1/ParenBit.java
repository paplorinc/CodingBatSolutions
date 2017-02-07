package recursion_1;

import java.util.*;

/**
 * Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
 * Source: http://codingbat.com/prob/p137918
 */
public class ParenBit {
  public String parenBit(String str) {
    if (!str.startsWith("(")) return parenBit(str.substring(1));
    else if (!str.endsWith(")")) return parenBit(str.substring(0, str.length() - 1));
    else return str;
  }
}

