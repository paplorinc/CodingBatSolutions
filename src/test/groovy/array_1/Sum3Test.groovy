package array_1;

import spock.lang.Specification

class Sum3Test extends Specification {
  def 'sum3'() {
    setup:
      def subject = new Sum3()
    expect:
      subject.sum3([1, 2, 3] as int[]) == 6
      subject.sum3([5, 11, 2] as int[]) == 18
      subject.sum3([7, 0, 0] as int[]) == 7
      subject.sum3([1, 2, 1] as int[]) == 4
      subject.sum3([1, 1, 1] as int[]) == 3
      subject.sum3([2, 7, 2] as int[]) == 11
  }
}

