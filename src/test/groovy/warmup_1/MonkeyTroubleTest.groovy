package warmup_1;

import spock.lang.Specification

class MonkeyTroubleTest extends Specification {
  def 'monkeyTrouble'() {
    setup:
      def subject = new MonkeyTrouble()
    expect:
      subject.monkeyTrouble(true, true) == true
      subject.monkeyTrouble(false, false) == true
      subject.monkeyTrouble(true, false) == false
      subject.monkeyTrouble(false, true) == false
  }
}

