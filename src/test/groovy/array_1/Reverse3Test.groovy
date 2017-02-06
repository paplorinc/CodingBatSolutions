package array_1;

import spock.lang.Specification

class Reverse3Test extends Specification {
  def 'reverse3'() {
    setup:
      def subject = new Reverse3()
    expect:
      subject.reverse3([1, 2, 3] as int[]) == [3, 2, 1]
      subject.reverse3([5, 11, 9] as int[]) == [9, 11, 5]
      subject.reverse3([7, 0, 0] as int[]) == [0, 0, 7]
      subject.reverse3([2, 1, 2] as int[]) == [2, 1, 2]
      subject.reverse3([1, 2, 1] as int[]) == [1, 2, 1]
      subject.reverse3([2, 11, 3] as int[]) == [3, 11, 2]
      subject.reverse3([0, 6, 5] as int[]) == [5, 6, 0]
      subject.reverse3([7, 2, 3] as int[]) == [3, 2, 7]
  }
}

