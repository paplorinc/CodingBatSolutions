package array_2;

import spock.lang.Specification

class ShiftLeftTest extends Specification {
  def 'shiftLeft'() {
    setup:
      def subject = new ShiftLeft()
    expect:
      subject.shiftLeft([6, 2, 5, 3] as int[]) == [2, 5, 3, 6]
      subject.shiftLeft([1, 2] as int[]) == [2, 1]
      subject.shiftLeft([1] as int[]) == [1]
      subject.shiftLeft([] as int[]) == []
      subject.shiftLeft([1, 1, 2, 2, 4] as int[]) == [1, 2, 2, 4, 1]
      subject.shiftLeft([1, 1, 1] as int[]) == [1, 1, 1]
      subject.shiftLeft([1, 2, 3] as int[]) == [2, 3, 1]
  }
}

