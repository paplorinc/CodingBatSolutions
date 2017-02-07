package recursion_1;

import spock.lang.Specification

class ChangePiTest extends Specification {
  def 'changePi'() {
    setup:
      def subject = new ChangePi()
    expect:
      subject.changePi('xpix') == "x3.14x"
      subject.changePi('pipi') == "3.143.14"
      subject.changePi('pip') == "3.14p"
      subject.changePi('pi') == "3.14"
      subject.changePi('hip') == "hip"
      subject.changePi('p') == "p"
      subject.changePi('x') == "x"
      subject.changePi('') == ""
      subject.changePi('pixx') == "3.14xx"
      subject.changePi('xyzzy') == "xyzzy"
  }
}

