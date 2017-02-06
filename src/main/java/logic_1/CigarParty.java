package logic_1;

import java.util.*;

/**
 * When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
 * Source: http://codingbat.com/prob/p159531
 */
public class CigarParty {
  public boolean cigarParty(int cigars, boolean isWeekend) {
    return 40 <= cigars && (isWeekend || cigars <= 60);
  }
}

