package ap_1;

import java.util.*;

/**
 * We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
 * Source: http://codingbat.com/prob/p165941
 */
public class DividesSelf {
  public boolean dividesSelf(int n) {
    for (int i = n; i > 0; i /= 10) {
      if (!divides(n, i % 10))
        return false;
    }
    return true;
  }
  
  boolean divides(int i, int j) { return (j != 0) && (i % j) == 0; }
}

