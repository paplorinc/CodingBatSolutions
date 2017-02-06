package array_3;

import java.util.*;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
 * Source: http://codingbat.com/prob/p134022
 */
public class LinearIn {
  public boolean linearIn(int[] outers, int[] inners) {
    Set<Integer> visited = new HashSet<Integer>(outers.length);
    for (int inner : outers) visited.add(inner);
    
    for (int outer : inners)
      if (!visited.contains(outer))
        return false;
  
    return true;
  }
  
  // public boolean linearIn(int[] outers, int[] inners) {
  //   int i = 0;
  //   for (int inner : inners) {
  //     while ((i < outers.length) && (outers[i] < inner))
  //       i++;
  //     if ((i >= outers.length) || (outers[i] != inner))
  //       return false;
  //   }
  //   return true;
  // }
}

