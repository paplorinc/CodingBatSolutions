package array_2;

import spock.lang.Specification

class ZeroMaxTest extends Specification {
  def 'zeroMax'() {
    setup:
      def subject = new ZeroMax()
    expect:
      subject.zeroMax([0, 5, 0, 3] as int[]) == [5, 5, 3, 3]
      subject.zeroMax([0, 4, 0, 3] as int[]) == [3, 4, 3, 3]
      subject.zeroMax([0, 1, 0] as int[]) == [1, 1, 0]
      subject.zeroMax([0, 1, 5] as int[]) == [5, 1, 5]
      subject.zeroMax([0, 2, 0] as int[]) == [0, 2, 0]
      subject.zeroMax([1] as int[]) == [1]
      subject.zeroMax([0] as int[]) == [0]
      subject.zeroMax([] as int[]) == []
      subject.zeroMax([7, 0, 4, 3, 0, 2] as int[]) == [7, 3, 4, 3, 0, 2]
      subject.zeroMax([7, 0, 4, 3, 0, 1] as int[]) == [7, 3, 4, 3, 1, 1]
      subject.zeroMax([7, 0, 4, 3, 0, 0] as int[]) == [7, 3, 4, 3, 0, 0]
      subject.zeroMax([7, 0, 1, 0, 0, 7] as int[]) == [7, 7, 1, 7, 7, 7]
  }
}

