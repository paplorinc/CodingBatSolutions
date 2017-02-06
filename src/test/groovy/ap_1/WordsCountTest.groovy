package ap_1;

import spock.lang.Specification

class WordsCountTest extends Specification {
  def 'wordsCount'() {
    setup:
      def subject = new WordsCount()
    expect:
      subject.wordsCount(['a', 'bb', 'b', 'ccc'] as String[], 1) == 2
      subject.wordsCount(['a', 'bb', 'b', 'ccc'] as String[], 3) == 1
      subject.wordsCount(['a', 'bb', 'b', 'ccc'] as String[], 4) == 0
      subject.wordsCount(['xx', 'yyy', 'x', 'yy', 'z'] as String[], 1) == 2
      subject.wordsCount(['xx', 'yyy', 'x', 'yy', 'z'] as String[], 2) == 2
      subject.wordsCount(['xx', 'yyy', 'x', 'yy', 'z'] as String[], 3) == 1
  }
}

