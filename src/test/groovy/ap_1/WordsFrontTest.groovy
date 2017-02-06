package ap_1;

import spock.lang.Specification

class WordsFrontTest extends Specification {
  def 'wordsFront'() {
    setup:
      def subject = new WordsFront()
    expect:
      subject.wordsFront(['a', 'b', 'c', 'd'] as String[], 1) == ["a"]
      subject.wordsFront(['a', 'b', 'c', 'd'] as String[], 2) == ["a", "b"]
      subject.wordsFront(['a', 'b', 'c', 'd'] as String[], 3) == ["a", "b", "c"]
      subject.wordsFront(['a', 'b', 'c', 'd'] as String[], 4) == ["a", "b", "c", "d"]
      subject.wordsFront(['Hi', 'There'] as String[], 1) == ["Hi"]
      subject.wordsFront(['Hi', 'There'] as String[], 2) == ["Hi", "There"]
  }
}

