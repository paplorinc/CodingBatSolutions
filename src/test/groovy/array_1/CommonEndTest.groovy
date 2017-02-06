package array_1;

import spock.lang.Specification

class CommonEndTest extends Specification {
  def 'commonEnd'() {
    setup:
      def subject = new CommonEnd()
    expect:
      subject.commonEnd([1, 2, 3] as int[], [7, 3] as int[]) == true
      subject.commonEnd([1, 2, 3] as int[], [7, 3, 2] as int[]) == false
      subject.commonEnd([1, 2, 3] as int[], [1, 3] as int[]) == true
      subject.commonEnd([1, 2, 3] as int[], [1] as int[]) == true
      subject.commonEnd([1, 2, 3] as int[], [2] as int[]) == false
  }
}

