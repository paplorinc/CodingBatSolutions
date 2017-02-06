package array_2;

import spock.lang.Specification

class FizzArrayTest extends Specification {
  def 'fizzArray'() {
    setup:
      def subject = new FizzArray()
    expect:
      subject.fizzArray(4) == [0, 1, 2, 3]
      subject.fizzArray(1) == [0]
      subject.fizzArray(10) == [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      subject.fizzArray(0) == []
      subject.fizzArray(2) == [0, 1]
      subject.fizzArray(7) == [0, 1, 2, 3, 4, 5, 6]
  }
}

