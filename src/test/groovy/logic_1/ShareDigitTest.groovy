package logic_1;

import spock.lang.Specification

class ShareDigitTest extends Specification {
  def 'shareDigit'() {
    setup:
      def subject = new ShareDigit()
    expect:
      subject.shareDigit(12, 23) == true
      subject.shareDigit(12, 43) == false
      subject.shareDigit(12, 44) == false
      subject.shareDigit(23, 12) == true
      subject.shareDigit(23, 39) == true
      subject.shareDigit(23, 19) == false
      subject.shareDigit(30, 90) == true
      subject.shareDigit(30, 91) == false
      subject.shareDigit(55, 55) == true
      subject.shareDigit(55, 44) == false
  }
}

