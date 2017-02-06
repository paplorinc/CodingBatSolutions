package warmup_2;

import spock.lang.Specification

class FrontTimesTest extends Specification {
  def 'frontTimes'() {
    setup:
      def subject = new FrontTimes()
    expect:
      subject.frontTimes('Chocolate', 2) == "ChoCho"
      subject.frontTimes('Chocolate', 3) == "ChoChoCho"
      subject.frontTimes('Abc', 3) == "AbcAbcAbc"
      subject.frontTimes('Ab', 4) == "AbAbAbAb"
      subject.frontTimes('A', 4) == "AAAA"
      subject.frontTimes('', 4) == ""
      subject.frontTimes('Abc', 0) == ""
  }
}

