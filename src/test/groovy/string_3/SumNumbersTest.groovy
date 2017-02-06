package string_3;

import spock.lang.Specification

class SumNumbersTest extends Specification {
  def 'sumNumbers'() {
    setup:
      def subject = new SumNumbers()
    expect:
      subject.sumNumbers('abc123xyz') == 123
      subject.sumNumbers('aa11b33') == 44
      subject.sumNumbers('7 11') == 18
      subject.sumNumbers('Chocolate') == 0
      subject.sumNumbers('5hoco1a1e') == 7
      subject.sumNumbers('5$$1;;1!!') == 7
      subject.sumNumbers('a1234bb11') == 1245
      subject.sumNumbers('') == 0
      subject.sumNumbers('a22bbb3') == 25
  }
}

