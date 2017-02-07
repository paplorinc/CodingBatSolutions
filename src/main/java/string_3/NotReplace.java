package string_3;

import java.util.*;

/**
 * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
 * Source: http://codingbat.com/prob/p154137
 */
public class NotReplace {
  public String notReplace(String str) {
    return str.replaceAll("\\bis\\b", "$0 not");
  }
}

