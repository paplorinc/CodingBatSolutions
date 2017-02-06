package array_1;

import spock.lang.Specification

class MaxEnd3Test extends Specification {
  def 'maxEnd3'() {
    setup:
      def subject = new MaxEnd3()
    expect:
      subject.maxEnd3([1, 2, 3] as int[]) == [3, 3, 3]
      subject.maxEnd3([11, 5, 9] as int[]) == [11, 11, 11]
      subject.maxEnd3([2, 11, 3] as int[]) == [3, 3, 3]
      subject.maxEnd3([11, 3, 3] as int[]) == [11, 11, 11]
      subject.maxEnd3([3, 11, 11] as int[]) == [11, 11, 11]
      subject.maxEnd3([2, 2, 2] as int[]) == [2, 2, 2]
      subject.maxEnd3([2, 11, 2] as int[]) == [2, 2, 2]
      subject.maxEnd3([0, 0, 1] as int[]) == [1, 1, 1]
  }
}

