package string_1;

import java.util.*;

/**
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
 * Source: http://codingbat.com/prob/p147483
 */
public class MakeTags {
  public String makeTags(String tag, String word) {
    return String.format("<%s>%s</%s>", tag, word, tag);
  }
}

