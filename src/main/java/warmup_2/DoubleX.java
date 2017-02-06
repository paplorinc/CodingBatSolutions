package warmup_2;

import java.util.*;

/**
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 * Source: http://codingbat.com/prob/p186759
 */
public class DoubleX {
  boolean doubleX(String str) {
    int index1 = str.indexOf("x");
    int index2 = str.indexOf("xx");
    return index1 >= 0 && index1 == index2;
  }
}

