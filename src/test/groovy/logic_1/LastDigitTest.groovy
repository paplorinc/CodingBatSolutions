package logic_1;

import spock.lang.Specification

class LastDigitTest extends Specification {
  def 'lastDigit'() {
    setup:
      def subject = new LastDigit()
    expect:
      subject.lastDigit(23, 19, 13) == true
      subject.lastDigit(23, 19, 12) == false
      subject.lastDigit(23, 19, 3) == true
      subject.lastDigit(23, 19, 39) == true
      subject.lastDigit(1, 2, 3) == false
      subject.lastDigit(1, 1, 2) == true
      subject.lastDigit(1, 2, 2) == true
      subject.lastDigit(14, 25, 43) == false
      subject.lastDigit(14, 25, 45) == true
      subject.lastDigit(248, 106, 1002) == false
      subject.lastDigit(248, 106, 1008) == true
      subject.lastDigit(10, 11, 20) == true
      subject.lastDigit(0, 11, 0) == true
  }
}

