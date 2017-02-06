package string_2;

import java.util.*;

/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 * Source: http://codingbat.com/prob/p111624
 */
public class CatDog {
  public boolean catDog(String str) {
    return count(str, "cat") == count(str, "dog");
  }
  
  int count(String source, String target) {
    return (source.length() - source.replaceAll(target, "").length()) / target.length();
  }
}

