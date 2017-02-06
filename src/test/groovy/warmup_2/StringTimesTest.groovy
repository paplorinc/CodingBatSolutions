package warmup_2;

import spock.lang.Specification

class StringTimesTest extends Specification {
  def 'stringTimes'() {
    setup:
      def subject = new StringTimes()
    expect:
      subject.stringTimes('Hi', 2) == "HiHi"
      subject.stringTimes('Hi', 3) == "HiHiHi"
      subject.stringTimes('Hi', 1) == "Hi"
      subject.stringTimes('Hi', 0) == ""
      subject.stringTimes('Hi', 5) == "HiHiHiHiHi"
      subject.stringTimes('Oh Boy!', 2) == "Oh Boy!Oh Boy!"
      subject.stringTimes('x', 4) == "xxxx"
      subject.stringTimes('', 4) == ""
      subject.stringTimes('code', 2) == "codecode"
      subject.stringTimes('code', 3) == "codecodecode"
  }
}

