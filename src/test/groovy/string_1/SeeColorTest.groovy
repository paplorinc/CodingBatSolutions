package string_1;

import spock.lang.Specification

class SeeColorTest extends Specification {
  def 'seeColor'() {
    setup:
      def subject = new SeeColor()
    expect:
      subject.seeColor('redxx') == "red"
      subject.seeColor('xxred') == ""
      subject.seeColor('blueTimes') == "blue"
      subject.seeColor('NoColor') == ""
      subject.seeColor('red') == "red"
      subject.seeColor('re') == ""
      subject.seeColor('blu') == ""
      subject.seeColor('blue') == "blue"
      subject.seeColor('a') == ""
      subject.seeColor('') == ""
      subject.seeColor('xyzred') == ""
  }
}

