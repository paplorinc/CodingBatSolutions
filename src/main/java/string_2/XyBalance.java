package string_2;

import java.util.*;

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
 * Source: http://codingbat.com/prob/p134250
 */
public class XyBalance {
  public boolean xyBalance(String str) {
    return str.lastIndexOf('y') >= str.lastIndexOf('x');
  }
}

