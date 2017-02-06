package string_1;

import spock.lang.Specification

class NTwiceTest extends Specification {
  def 'nTwice'() {
    setup:
      def subject = new NTwice()
    expect:
      subject.nTwice('Hello', 2) == "Helo"
      subject.nTwice('Chocolate', 3) == "Choate"
      subject.nTwice('Chocolate', 1) == "Ce"
      subject.nTwice('Chocolate', 0) == ""
      subject.nTwice('Hello', 4) == "Hellello"
      subject.nTwice('Code', 4) == "CodeCode"
      subject.nTwice('Code', 2) == "Code"
  }
}

