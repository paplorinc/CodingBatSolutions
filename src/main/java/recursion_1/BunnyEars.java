package recursion_1;

import java.util.*;

/**
 * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
 * Source: http://codingbat.com/prob/p183649
 */
public class BunnyEars {
  public int bunnyEars(int bunnies) {
    if (bunnies == 0) return 0;
    else return 2 + bunnyEars(bunnies - 1);
  }
}

