package string_1;

import spock.lang.Specification

class FirstTwoTest extends Specification {
  def 'firstTwo'() {
    setup:
      def subject = new FirstTwo()
    expect:
      subject.firstTwo('Hello') == "He"
      subject.firstTwo('abcdefg') == "ab"
      subject.firstTwo('ab') == "ab"
      subject.firstTwo('a') == "a"
      subject.firstTwo('') == ""
      subject.firstTwo('Kitten') == "Ki"
      subject.firstTwo('hi') == "hi"
      subject.firstTwo('hiya') == "hi"
  }
}

