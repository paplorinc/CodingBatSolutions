package string_2;

import spock.lang.Specification

class RepeatEndTest extends Specification {
  def 'repeatEnd'() {
    setup:
      def subject = new RepeatEnd()
    expect:
      subject.repeatEnd('Hello', 3) == "llollollo"
      subject.repeatEnd('Hello', 2) == "lolo"
      subject.repeatEnd('Hello', 1) == "o"
      subject.repeatEnd('Hello', 0) == ""
      subject.repeatEnd('abc', 3) == "abcabcabc"
      subject.repeatEnd('1234', 2) == "3434"
      subject.repeatEnd('1234', 3) == "234234234"
      subject.repeatEnd('', 0) == ""
  }
}

