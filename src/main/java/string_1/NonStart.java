package string_1;

import java.util.*;

/**
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
 * Source: http://codingbat.com/prob/p143825
 */
public class NonStart {
  public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
  }
}

