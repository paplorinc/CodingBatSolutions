package warmup_2;

import java.util.*;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 * Source: http://codingbat.com/prob/p194667
 */
public class CountXX {
  int countXX(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++)
      if (str.substring(i).startsWith("xx"))
        count++;
    return count;
  }
}

