package ap_1;

import spock.lang.Specification

class WordsWithoutTest extends Specification {
  def 'wordsWithout'() {
    setup:
      def subject = new WordsWithout()
    expect:
      subject.wordsWithout(['a', 'b', 'c', 'a'] as String[], 'a') == ["b", "c"]
      subject.wordsWithout(['a', 'b', 'c', 'a'] as String[], 'b') == ["a", "c", "a"]
      subject.wordsWithout(['a', 'b', 'c', 'a'] as String[], 'c') == ["a", "b", "a"]
      subject.wordsWithout(['b', 'c', 'a', 'a'] as String[], 'b') == ["c", "a", "a"]
      subject.wordsWithout(['xx', 'yyy', 'x', 'yy', 'x'] as String[], 'x') == ["xx", "yyy", "yy"]
      subject.wordsWithout(['xx', 'yyy', 'x', 'yy', 'x'] as String[], 'yy') == ["xx", "yyy", "x", "x"]
      subject.wordsWithout(['aa', 'ab', 'ac', 'aa'] as String[], 'aa') == ["ab", "ac"]
  }
}

