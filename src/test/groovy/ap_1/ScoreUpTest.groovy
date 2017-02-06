package ap_1;

import spock.lang.Specification

class ScoreUpTest extends Specification {
  def 'scoreUp'() {
    setup:
      def subject = new ScoreUp()
    expect:
      subject.scoreUp(['a', 'a', 'b', 'b'] as String[], ['a', 'c', 'b', 'c'] as String[]) == 6
      subject.scoreUp(['a', 'a', 'b', 'b'] as String[], ['a', 'a', 'b', 'c'] as String[]) == 11
      subject.scoreUp(['a', 'a', 'b', 'b'] as String[], ['a', 'a', 'b', 'b'] as String[]) == 16
      subject.scoreUp(['a', 'a', 'b', 'b'] as String[], ['?', 'c', 'b', '?'] as String[]) == 3
      subject.scoreUp(['a', 'a', 'b', 'b'] as String[], ['?', 'c', '?', '?'] as String[]) == -1
      subject.scoreUp(['a', 'a', 'b', 'b'] as String[], ['c', '?', 'b', 'b'] as String[]) == 7
      subject.scoreUp(['a', 'a', 'b', 'b'] as String[], ['c', '?', 'b', '?'] as String[]) == 3
      subject.scoreUp(['a', 'b', 'c'] as String[], ['a', 'c', 'b'] as String[]) == 2
      subject.scoreUp(['a', 'a', 'b', 'b', 'c', 'c'] as String[], ['a', 'c', 'a', 'c', 'a', 'c'] as String[]) == 4
      subject.scoreUp(['a', 'a', 'b', 'b', 'c', 'c'] as String[], ['a', 'c', '?', '?', 'a', 'c'] as String[]) == 6
      subject.scoreUp(['a', 'a', 'b', 'b', 'c', 'c'] as String[], ['a', 'c', '?', '?', 'c', 'c'] as String[]) == 11
      subject.scoreUp(['a', 'b', 'c'] as String[], ['a', 'b', 'c'] as String[]) == 12
  }
}

