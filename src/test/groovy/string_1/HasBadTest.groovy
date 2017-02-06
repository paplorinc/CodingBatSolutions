package string_1;

import spock.lang.Specification

class HasBadTest extends Specification {
  def 'hasBad'() {
    setup:
      def subject = new HasBad()
    expect:
      subject.hasBad('badxx') == true
      subject.hasBad('xbadxx') == true
      subject.hasBad('xxbadxx') == false
      subject.hasBad('code') == false
      subject.hasBad('bad') == true
      subject.hasBad('ba') == false
      subject.hasBad('xba') == false
      subject.hasBad('xbad') == true
      subject.hasBad('') == false
      subject.hasBad('badyy') == true
  }
}

