package string_1;

import java.util.*;

/**
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
 * Source: http://codingbat.com/prob/p108853
 */
public class ExtraEnd {
  public String extraEnd(String str) {
    String suffix = str.substring(str.length() -2);
    return suffix + suffix + suffix;
  }
}

