package logic_1;

import java.util.*;

/**
 * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
 * Source: http://codingbat.com/prob/p141061
 */
public class SquirrelPlay {
  public boolean squirrelPlay(int temp, boolean isSummer) {
    return isTemperatureOk(temp, isSummer);
  }
  
  boolean isTemperatureOk(int t, boolean isSummer) { return 60 <= t && t <= (isSummer ? 100 : 90); }
}

