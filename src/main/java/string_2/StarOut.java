package string_2;

import java.util.*;

/**
 * Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 * Source: http://codingbat.com/prob/p139564
 */
public class StarOut {
  public String starOut(String str) {
    return str.replaceAll(".?\\*+.?", "");
  }
}

