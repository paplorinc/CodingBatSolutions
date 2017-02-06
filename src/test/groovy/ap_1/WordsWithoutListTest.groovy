package ap_1;

import spock.lang.Specification

class WordsWithoutListTest extends Specification {
  def 'wordsWithoutList'() {
    setup:
      def subject = new WordsWithoutList()
    expect:
      subject.wordsWithoutList(['a', 'bb', 'b', 'ccc'] as String[], 1) == ["bb", "ccc"]
      subject.wordsWithoutList(['a', 'bb', 'b', 'ccc'] as String[], 3) == ["a", "bb", "b"]
      subject.wordsWithoutList(['a', 'bb', 'b', 'ccc'] as String[], 4) == ["a", "bb", "b", "ccc"]
      subject.wordsWithoutList(['xx', 'yyy', 'x', 'yy', 'z'] as String[], 1) == ["xx", "yyy", "yy"]
      subject.wordsWithoutList(['xx', 'yyy', 'x', 'yy', 'z'] as String[], 2) == ["yyy", "x", "z"]
  }
}

