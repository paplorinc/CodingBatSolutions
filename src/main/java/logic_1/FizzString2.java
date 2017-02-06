package logic_1;

import java.util.*;

/**
 * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)
 * Source: http://codingbat.com/prob/p115243
 */
public class FizzString2 {
  public String fizzString2(int n) {
    if (divides(n, 3*5)) return "FizzBuzz!";
    else if (divides(n, 3)) return "Fizz!";
    else if (divides(n, 5)) return "Buzz!";
    else return n + "!";
  }
  
  boolean divides(int a, int b) { return a % b == 0; }
}

