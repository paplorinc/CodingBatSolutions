package warmup_1;

import spock.lang.Specification

class SleepInTest extends Specification {
  def 'sleepIn'() {
    setup:
      def subject = new SleepIn()
    expect:
      subject.sleepIn(false, false) == true
      subject.sleepIn(true, false) == false
      subject.sleepIn(false, true) == true
      subject.sleepIn(true, true) == true
  }
}

