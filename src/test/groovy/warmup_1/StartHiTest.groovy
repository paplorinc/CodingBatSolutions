package warmup_1;

import spock.lang.Specification

class StartHiTest extends Specification {
  def 'startHi'() {
    setup:
      def subject = new StartHi()
    expect:
      subject.startHi('hi there') == true
      subject.startHi('hi') == true
      subject.startHi('hello hi') == false
      subject.startHi('he') == false
      subject.startHi('h') == false
      subject.startHi('') == false
      subject.startHi('ho hi') == false
      subject.startHi('hi ho') == true
  }
}

