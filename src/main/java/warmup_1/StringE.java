package warmup_1;

import java.util.*;

/**
 * Return true if the given string contains between 1 and 3 'e' chars.
 * Source: http://codingbat.com/prob/p173784
 */
public class StringE {
  public boolean stringE(String str) {
    int result = str.replaceAll("[^e]", "").length();
    return 1 <= result && result <= 3;
  }
}

