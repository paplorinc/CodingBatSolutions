package string_1;

import spock.lang.Specification

class MiddleTwoTest extends Specification {
  def 'middleTwo'() {
    setup:
      def subject = new MiddleTwo()
    expect:
      subject.middleTwo('string') == "ri"
      subject.middleTwo('code') == "od"
      subject.middleTwo('Practice') == "ct"
      subject.middleTwo('ab') == "ab"
      subject.middleTwo('0123456789') == "45"
  }
}

