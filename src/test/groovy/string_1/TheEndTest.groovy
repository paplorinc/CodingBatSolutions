package string_1;

import spock.lang.Specification

class TheEndTest extends Specification {
  def 'theEnd'() {
    setup:
      def subject = new TheEnd()
    expect:
      subject.theEnd('Hello', true) == "H"
      subject.theEnd('Hello', false) == "o"
      subject.theEnd('oh', true) == "o"
      subject.theEnd('oh', false) == "h"
      subject.theEnd('x', true) == "x"
      subject.theEnd('x', false) == "x"
      subject.theEnd('java', true) == "j"
      subject.theEnd('chocolate', false) == "e"
      subject.theEnd('1234', true) == "1"
      subject.theEnd('code', false) == "e"
  }
}

