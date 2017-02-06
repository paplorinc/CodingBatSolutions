package warmup_1;

import java.util.*;

/**
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 * Source: http://codingbat.com/prob/p151713
 */
public class MixStart {
  public boolean mixStart(String str) {
    return str.indexOf("ix") == 1;
  }
}

