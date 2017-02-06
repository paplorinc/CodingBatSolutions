package array_2;

import spock.lang.Specification

class EvenOddTest extends Specification {
  def 'evenOdd'() {
    setup:
      def subject = new EvenOdd()
    expect:
      subject.evenOdd([1, 0, 1, 0, 0, 1, 1] as int[]) == [0, 0, 0, 1, 1, 1, 1]
      subject.evenOdd([3, 3, 2] as int[]) == [2, 3, 3]
      subject.evenOdd([2, 2, 2] as int[]) == [2, 2, 2]
      subject.evenOdd([3, 2, 2] as int[]) == [2, 2, 3]
      subject.evenOdd([1, 1, 0, 1, 0] as int[]) == [0, 0, 1, 1, 1]
      subject.evenOdd([1] as int[]) == [1]
      subject.evenOdd([1, 2] as int[]) == [2, 1]
      subject.evenOdd([2, 1] as int[]) == [2, 1]
      subject.evenOdd([] as int[]) == []
  }
}

