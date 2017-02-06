package logic_1;

import java.util.*;

/**
 * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 * Source: http://codingbat.com/prob/p137136
 */
public class FizzString {
  public String fizzString(String str) {
    if (str.isEmpty()) return str;
    else {
      boolean starts = str.charAt(0) == 'f';
      boolean ends = str.charAt(str.length() - 1) == 'b';
      if (starts && ends) return "FizzBuzz";
      else if (starts) return "Fizz";
      else if (ends) return "Buzz";
      else return str;
    }
  }
}

