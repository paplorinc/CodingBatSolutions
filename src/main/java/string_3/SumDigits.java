package string_3;

import java.util.*;

/**
 * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 * Source: http://codingbat.com/prob/p197890
 */
public class SumDigits {
  public int sumDigits(String str) {
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if ('0' <= c && c <= '9')
      sum += c - '0';
    }
    return sum;
  }
}

