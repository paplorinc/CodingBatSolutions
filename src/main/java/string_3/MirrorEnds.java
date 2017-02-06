package string_3;

import java.util.*;

/**
 * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
 * Source: http://codingbat.com/prob/p139411
 */
public class MirrorEnds {
  public String mirrorEnds(String str) {
    for (int i = 0; i < str.length(); i++)
      if (str.charAt(i) != str.charAt((str.length() - 1) - i))
        return str.substring(0, Math.max(0, i));
    return str;
  }
}

