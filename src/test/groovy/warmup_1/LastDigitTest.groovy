package warmup_1;

import spock.lang.Specification

class LastDigitTest extends Specification {
  def 'lastDigit'() {
    setup:
      def subject = new LastDigit()
    expect:
      subject.lastDigit(7, 17) == true
      subject.lastDigit(6, 17) == false
      subject.lastDigit(3, 113) == true
      subject.lastDigit(114, 113) == false
      subject.lastDigit(114, 4) == true
      subject.lastDigit(10, 0) == true
      subject.lastDigit(11, 0) == false
  }
}

