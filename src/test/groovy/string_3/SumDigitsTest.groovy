package string_3;

import spock.lang.Specification

class SumDigitsTest extends Specification {
  def 'sumDigits'() {
    setup:
      def subject = new SumDigits()
    expect:
      subject.sumDigits('aa1bc2d3') == 6
      subject.sumDigits('aa11b33') == 8
      subject.sumDigits('Chocolate') == 0
      subject.sumDigits('5hoco1a1e') == 7
      subject.sumDigits('123abc123') == 12
      subject.sumDigits('') == 0
      subject.sumDigits('Hello') == 0
      subject.sumDigits('X1z9b2') == 12
      subject.sumDigits('5432a') == 14
  }
}

