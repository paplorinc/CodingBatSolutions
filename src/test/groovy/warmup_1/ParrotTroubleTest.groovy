package warmup_1;

import spock.lang.Specification

class ParrotTroubleTest extends Specification {
  def 'parrotTrouble'() {
    setup:
      def subject = new ParrotTrouble()
    expect:
      subject.parrotTrouble(true, 6) == true
      subject.parrotTrouble(true, 7) == false
      subject.parrotTrouble(false, 6) == false
      subject.parrotTrouble(true, 21) == true
      subject.parrotTrouble(false, 21) == false
      subject.parrotTrouble(false, 20) == false
      subject.parrotTrouble(true, 23) == true
      subject.parrotTrouble(false, 23) == false
      subject.parrotTrouble(true, 20) == false
      subject.parrotTrouble(false, 12) == false
  }
}

