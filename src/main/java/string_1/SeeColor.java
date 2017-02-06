package string_1;

import java.util.*;

/**
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 * Source: http://codingbat.com/prob/p199216
 */
public class SeeColor {
  public String seeColor(String str) {
    if (str.startsWith("red")) return "red";
    else if (str.startsWith("blue")) return "blue";
    else return "";
  }
}

