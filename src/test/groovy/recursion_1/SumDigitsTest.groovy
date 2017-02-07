package recursion_1;

import spock.lang.Specification

class SumDigitsTest extends Specification {
  def 'sumDigits'() {
    setup:
      def subject = new SumDigits()
    expect:
      subject.sumDigits(126) == 9
      subject.sumDigits(49) == 13
      subject.sumDigits(12) == 3
      subject.sumDigits(10) == 1
      subject.sumDigits(1) == 1
      subject.sumDigits(0) == 0
      subject.sumDigits(730) == 10
      subject.sumDigits(1111) == 4
      subject.sumDigits(11111) == 5
      subject.sumDigits(10110) == 3
      subject.sumDigits(235) == 10
  }
}

