package string_3;

import java.util.*;

/**
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 * Source: http://codingbat.com/prob/p121193
 */
public class SumNumbers {
  public int sumNumbers(String str) {
    int sum = 0;
    String[] numbers = str.split("\\D");
    for (String number : numbers)
      if (!number.isEmpty())
        sum += Integer.parseInt(number);
    return sum;
  }
}

