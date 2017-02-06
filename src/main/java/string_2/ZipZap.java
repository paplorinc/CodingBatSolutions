package string_2;

import java.util.*;

/**
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
 * Source: http://codingbat.com/prob/p180759
 */
public class ZipZap {
  public String zipZap(String str) {
    return str.replaceAll("(z).(p)", "$1$2");
  }
}

