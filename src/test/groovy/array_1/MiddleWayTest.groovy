package array_1;

import spock.lang.Specification

class MiddleWayTest extends Specification {
  def 'middleWay'() {
    setup:
      def subject = new MiddleWay()
    expect:
      subject.middleWay([1, 2, 3] as int[], [4, 5, 6] as int[]) == [2, 5]
      subject.middleWay([7, 7, 7] as int[], [3, 8, 0] as int[]) == [7, 8]
      subject.middleWay([5, 2, 9] as int[], [1, 4, 5] as int[]) == [2, 4]
      subject.middleWay([1, 9, 7] as int[], [4, 8, 8] as int[]) == [9, 8]
      subject.middleWay([1, 2, 3] as int[], [3, 1, 4] as int[]) == [2, 1]
      subject.middleWay([1, 2, 3] as int[], [4, 1, 1] as int[]) == [2, 1]
  }
}

