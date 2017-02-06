package string_1;

import spock.lang.Specification

class ExtraFrontTest extends Specification {
  def 'extraFront'() {
    setup:
      def subject = new ExtraFront()
    expect:
      subject.extraFront('Hello') == "HeHeHe"
      subject.extraFront('ab') == "ababab"
      subject.extraFront('H') == "HHH"
      subject.extraFront('') == ""
      subject.extraFront('Candy') == "CaCaCa"
      subject.extraFront('Code') == "CoCoCo"
  }
}

