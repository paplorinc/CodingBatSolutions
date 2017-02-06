package array_2;

import spock.lang.Specification

class FizzArray3Test extends Specification {
  def 'fizzArray3'() {
    setup:
      def subject = new FizzArray3()
    expect:
      subject.fizzArray3(5, 10) == [5, 6, 7, 8, 9]
      subject.fizzArray3(11, 18) == [11, 12, 13, 14, 15, 16, 17]
      subject.fizzArray3(1, 3) == [1, 2]
      subject.fizzArray3(1, 2) == [1]
      subject.fizzArray3(1, 1) == []
      subject.fizzArray3(1000, 1005) == [1000, 1001, 1002, 1003, 1004]
  }
}

