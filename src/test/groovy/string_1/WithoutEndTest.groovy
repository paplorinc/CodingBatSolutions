package string_1;

import spock.lang.Specification

class WithoutEndTest extends Specification {
  def 'withoutEnd'() {
    setup:
      def subject = new WithoutEnd()
    expect:
      subject.withoutEnd('Hello') == "ell"
      subject.withoutEnd('java') == "av"
      subject.withoutEnd('coding') == "odin"
      subject.withoutEnd('code') == "od"
      subject.withoutEnd('ab') == ""
      subject.withoutEnd('Chocolate!') == "hocolate"
      subject.withoutEnd('kitten') == "itte"
      subject.withoutEnd('woohoo') == "ooho"
  }
}

