package string_2;

import java.util.*;

/**
 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
 * Source: http://codingbat.com/prob/p125185
 */
public class MixString {
  public String mixString(String a, String b) {
    StringBuilder result = new StringBuilder(a.length() + b.length());
    
    int minLength = Math.min(a.length(), b.length());
    for (int i = 0; i < minLength; i++)
      result.append(a.charAt(i)).append(b.charAt(i));
   
    if (a.length() > b.length()) result.append(a.substring(minLength));
    else result.append(b.substring(minLength));
      
    return result.toString();
  }
}

