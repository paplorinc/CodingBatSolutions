package string_1;

import spock.lang.Specification

class LastTwoTest extends Specification {
  def 'lastTwo'() {
    setup:
      def subject = new LastTwo()
    expect:
      subject.lastTwo('coding') == "codign"
      subject.lastTwo('cat') == "cta"
      subject.lastTwo('ab') == "ba"
      subject.lastTwo('a') == "a"
      subject.lastTwo('') == ""
  }
}

