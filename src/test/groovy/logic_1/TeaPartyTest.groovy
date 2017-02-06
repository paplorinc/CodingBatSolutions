package logic_1;

import spock.lang.Specification

class TeaPartyTest extends Specification {
  def 'teaParty'() {
    setup:
      def subject = new TeaParty()
    expect:
      subject.teaParty(6, 8) == 1
      subject.teaParty(3, 8) == 0
      subject.teaParty(20, 6) == 2
      subject.teaParty(12, 6) == 2
      subject.teaParty(11, 6) == 1
      subject.teaParty(11, 4) == 0
      subject.teaParty(4, 5) == 0
      subject.teaParty(5, 5) == 1
      subject.teaParty(6, 6) == 1
      subject.teaParty(5, 10) == 2
      subject.teaParty(5, 9) == 1
      subject.teaParty(10, 4) == 0
      subject.teaParty(10, 20) == 2
  }
}

