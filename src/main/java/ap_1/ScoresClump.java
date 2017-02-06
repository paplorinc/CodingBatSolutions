package ap_1;

import java.util.*;

/**
 * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
 * Source: http://codingbat.com/prob/p194530
 */
public class ScoresClump {
  public boolean scoresClump(int[] scores) {
    if (scores.length >= 3)
      for (int i = 1; i + 1 < scores.length; i++)
        if (isOk(scores[i - 1], scores[i]) && isOk(scores[i], scores[i + 1]) && isOk(scores[i - 1], scores[i + 1]))
          return true;
    return false;
  }
  
  boolean isOk(int i, int j) { return Math.abs(i - j) <= 2; }
}

