package warmup_1;

import spock.lang.Specification

class BackAroundTest extends Specification {
  def 'backAround'() {
    setup:
      def subject = new BackAround()
    expect:
      subject.backAround('cat') == "tcatt"
      subject.backAround('Hello') == "oHelloo"
      subject.backAround('a') == "aaa"
      subject.backAround('abc') == "cabcc"
      subject.backAround('read') == "dreadd"
      subject.backAround('boo') == "obooo"
  }
}

