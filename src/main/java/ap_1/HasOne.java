package ap_1;

import java.util.*;

/**
 * Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
 * Source: http://codingbat.com/prob/p191212
 */
public class HasOne {
  public boolean hasOne(int n) {
    for (int i = n; i > 0; i /= 10)
      if (i % 10 == 1)
        return true;
    return false;
  }
}

