package string_2;

import java.util.*;

/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 * Source: http://codingbat.com/prob/p175762
 */
public class BobThere {
  public boolean bobThere(String str) {
    return str.matches(".*b.b.*");
  }
}

