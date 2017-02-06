package ap_1;

import spock.lang.Specification

class CommonTwoTest extends Specification {
  def 'commonTwo'() {
    setup:
      def subject = new CommonTwo()
    expect:
      subject.commonTwo(['a', 'c', 'x'] as String[], ['b', 'c', 'd', 'x'] as String[]) == 2
      subject.commonTwo(['a', 'c', 'x'] as String[], ['a', 'b', 'c', 'x', 'z'] as String[]) == 3
      subject.commonTwo(['a', 'b', 'c'] as String[], ['a', 'b', 'c'] as String[]) == 3
      subject.commonTwo(['a', 'a', 'b', 'b', 'c'] as String[], ['a', 'b', 'c'] as String[]) == 3
      subject.commonTwo(['a', 'a', 'b', 'b', 'c'] as String[], ['a', 'b', 'b', 'b', 'c'] as String[]) == 3
      subject.commonTwo(['a', 'a', 'b', 'b', 'c'] as String[], ['a', 'b', 'b', 'c', 'c'] as String[]) == 3
      subject.commonTwo(['b', 'b', 'b', 'b', 'c'] as String[], ['a', 'b', 'b', 'b', 'c'] as String[]) == 2
      subject.commonTwo(['a', 'b', 'c', 'c', 'd'] as String[], ['a', 'b', 'b', 'c', 'd', 'd'] as String[]) == 4
      subject.commonTwo(['a', 'a', 'b', 'b', 'c'] as String[], ['b', 'b', 'b'] as String[]) == 1
      subject.commonTwo(['a', 'a', 'b', 'b', 'c'] as String[], ['c', 'c'] as String[]) == 1
      subject.commonTwo(['a', 'a', 'b', 'b', 'c'] as String[], ['b', 'b', 'b', 'x'] as String[]) == 1
      subject.commonTwo(['a', 'a', 'b', 'b', 'c'] as String[], ['b', 'b'] as String[]) == 1
      subject.commonTwo(['a'] as String[], ['a', 'b'] as String[]) == 1
      subject.commonTwo(['a'] as String[], ['b'] as String[]) == 0
      subject.commonTwo(['a', 'a'] as String[], ['b', 'b'] as String[]) == 0
      subject.commonTwo(['a', 'b'] as String[], ['a', 'b'] as String[]) == 2
  }
}

