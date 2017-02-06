package warmup_1;

import java.util.*;

/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 * Source: http://codingbat.com/prob/p181646
 */
public class MonkeyTrouble {
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile == bSmile;
  }
}

