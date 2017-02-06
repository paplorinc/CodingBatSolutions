package logic_1;

import java.util.*;

/**
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
 * Source: http://codingbat.com/prob/p115233
 */
public class WithoutDoubles {
  public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (noDoubles) {
      if (die1 == 6 && die2 == 6) 
        die1 = 1;
      else if (die1 == die2)
        die1++;
    }
    return die1 + die2;
  }
}

