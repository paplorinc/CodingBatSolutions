package string_1;

import spock.lang.Specification

class WithouEnd2Test extends Specification {
  def 'withouEnd2'() {
    setup:
      def subject = new WithouEnd2()
    expect:
      subject.withouEnd2('Hello') == "ell"
      subject.withouEnd2('abc') == "b"
      subject.withouEnd2('ab') == ""
      subject.withouEnd2('a') == ""
      subject.withouEnd2('') == ""
      subject.withouEnd2('coldy') == "old"
      subject.withouEnd2('java code') == "ava cod"
  }
}

