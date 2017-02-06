package logic_1;

import java.util.*;

/**
 * Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
 * Source: http://codingbat.com/prob/p110973
 */
public class AnswerCell {
  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    return !isAsleep && (!isMorning || isMom);
  }
}

