package logic_2;

import java.util.*;

/**
 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
 * Source: http://codingbat.com/prob/p183562
 */
public class MakeBricks {
  public boolean makeBricks(int small, int big, int goal) { // 7,1,11
    int smallBrickLength = 1, bigBrickLength = 5;
    
    int bigBrickCount = Math.min(big, goal / bigBrickLength);
    int smallBrickCount = (int)Math.ceil((goal - (bigBrickCount * bigBrickLength)) / (double)smallBrickLength);
    return small >= smallBrickCount;
  }
}

