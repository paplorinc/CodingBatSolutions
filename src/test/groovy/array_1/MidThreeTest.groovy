package array_1;

import spock.lang.Specification

class MidThreeTest extends Specification {
  def 'midThree'() {
    setup:
      def subject = new MidThree()
    expect:
      subject.midThree([1, 2, 3, 4, 5] as int[]) == [2, 3, 4]
      subject.midThree([8, 6, 7, 5, 3, 0, 9] as int[]) == [7, 5, 3]
      subject.midThree([1, 2, 3] as int[]) == [1, 2, 3]
  }
}

