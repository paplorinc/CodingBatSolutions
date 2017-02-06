package warmup_1;

import java.util.*;

/**
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 * Source: http://codingbat.com/prob/p100905
 */
public class DelDel {
  public String delDel(String str) {
    String delete = "del";
    if (str.indexOf(delete) == 1) 
      return str.charAt(0) + str.substring(1 + delete.length());
    else
      return str;
  }
}

