package array_2;

import spock.lang.Specification

class ZeroFrontTest extends Specification {
  def 'zeroFront'() {
    setup:
      def subject = new ZeroFront()
    expect:
      subject.zeroFront([1, 0, 0, 1] as int[]) == [0, 0, 1, 1]
      subject.zeroFront([0, 1, 1, 0, 1] as int[]) == [0, 0, 1, 1, 1]
      subject.zeroFront([1, 0] as int[]) == [0, 1]
      subject.zeroFront([0, 1] as int[]) == [0, 1]
      subject.zeroFront([1, 1, 1, 0] as int[]) == [0, 1, 1, 1]
      subject.zeroFront([2, 2, 2, 2] as int[]) == [2, 2, 2, 2]
      subject.zeroFront([0, 0, 1, 0] as int[]) == [0, 0, 0, 1]
      subject.zeroFront([-1, 0, 0, -1, 0] as int[]) == [0, 0, 0, -1, -1]
      subject.zeroFront([0, -3, 0, -3] as int[]) == [0, 0, -3, -3]
      subject.zeroFront([] as int[]) == []
      subject.zeroFront([9, 9, 0, 9, 0, 9] as int[]) == [0, 0, 9, 9, 9, 9]
  }
}

