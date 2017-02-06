package logic_1;

import spock.lang.Specification

class AlarmClockTest extends Specification {
  def 'alarmClock'() {
    setup:
      def subject = new AlarmClock()
    expect:
      subject.alarmClock(1, false) == "7:00"
      subject.alarmClock(5, false) == "7:00"
      subject.alarmClock(0, false) == "10:00"
      subject.alarmClock(6, false) == "10:00"
      subject.alarmClock(0, true) == "off"
      subject.alarmClock(6, true) == "off"
      subject.alarmClock(1, true) == "10:00"
      subject.alarmClock(3, true) == "10:00"
      subject.alarmClock(5, true) == "10:00"
  }
}

