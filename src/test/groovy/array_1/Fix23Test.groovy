package array_1;

import spock.lang.Specification

class Fix23Test extends Specification {
  def 'fix23'() {
    setup:
      def subject = new Fix23()
    expect:
      subject.fix23([1, 2, 3] as int[]) == [1, 2, 0]
      subject.fix23([2, 3, 5] as int[]) == [2, 0, 5]
      subject.fix23([1, 2, 1] as int[]) == [1, 2, 1]
      subject.fix23([3, 2, 1] as int[]) == [3, 2, 1]
      subject.fix23([2, 2, 3] as int[]) == [2, 2, 0]
      subject.fix23([2, 3, 3] as int[]) == [2, 0, 3]
  }
}

