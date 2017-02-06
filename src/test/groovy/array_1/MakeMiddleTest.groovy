package array_1;

import spock.lang.Specification

class MakeMiddleTest extends Specification {
  def 'makeMiddle'() {
    setup:
      def subject = new MakeMiddle()
    expect:
      subject.makeMiddle([1, 2, 3, 4] as int[]) == [2, 3]
      subject.makeMiddle([7, 1, 2, 3, 4, 9] as int[]) == [2, 3]
      subject.makeMiddle([1, 2] as int[]) == [1, 2]
      subject.makeMiddle([5, 2, 4, 7] as int[]) == [2, 4]
      subject.makeMiddle([9, 0, 4, 3, 9, 1] as int[]) == [4, 3]
  }
}

