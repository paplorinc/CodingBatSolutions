package logic_1;

import spock.lang.Specification

class CaughtSpeedingTest extends Specification {
  def 'caughtSpeeding'() {
    setup:
      def subject = new CaughtSpeeding()
    expect:
      subject.caughtSpeeding(60, false) == 0
      subject.caughtSpeeding(65, false) == 1
      subject.caughtSpeeding(65, true) == 0
      subject.caughtSpeeding(80, false) == 1
      subject.caughtSpeeding(85, false) == 2
      subject.caughtSpeeding(85, true) == 1
      subject.caughtSpeeding(70, false) == 1
      subject.caughtSpeeding(75, false) == 1
      subject.caughtSpeeding(75, true) == 1
      subject.caughtSpeeding(40, false) == 0
      subject.caughtSpeeding(40, true) == 0
      subject.caughtSpeeding(90, false) == 2
  }
}

