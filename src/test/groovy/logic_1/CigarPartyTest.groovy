package logic_1;

import spock.lang.Specification

class CigarPartyTest extends Specification {
  def 'cigarParty'() {
    setup:
      def subject = new CigarParty()
    expect:
      subject.cigarParty(30, false) == false
      subject.cigarParty(50, false) == true
      subject.cigarParty(70, true) == true
      subject.cigarParty(30, true) == false
      subject.cigarParty(50, true) == true
      subject.cigarParty(60, false) == true
      subject.cigarParty(61, false) == false
      subject.cigarParty(40, false) == true
      subject.cigarParty(39, false) == false
      subject.cigarParty(40, true) == true
      subject.cigarParty(39, true) == false
  }
}

