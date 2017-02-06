package string_1;

import spock.lang.Specification

class MiddleThreeTest extends Specification {
  def 'middleThree'() {
    setup:
      def subject = new MiddleThree()
    expect:
      subject.middleThree('Candy') == "and"
      subject.middleThree('and') == "and"
      subject.middleThree('solving') == "lvi"
      subject.middleThree('Hi yet Hi') == "yet"
      subject.middleThree('java yet java') == "yet"
      subject.middleThree('Chocolate') == "col"
      subject.middleThree('XabcxyzabcX') == "xyz"
  }
}

