package warmup_1;

import java.util.*;

/**
 * Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 * Source: http://codingbat.com/prob/p199720
 */
public class StartOz {
  public String startOz(String str) {
    return getString(0, str, 'o') + getString(1, str, 'z');
  }
  
  String getString(int index, String str, char expected) {
    return (str.length() > index && str.charAt(index) == expected) ? String.valueOf(expected) : "";
  }
}

