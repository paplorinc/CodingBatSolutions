package warmup_1;

import spock.lang.Specification

class PosNegTest extends Specification {
  def 'posNeg'() {
    setup:
      def subject = new PosNeg()
    expect:
      subject.posNeg(1, -1, false) == true
      subject.posNeg(-1, 1, false) == true
      subject.posNeg(-4, -5, true) == true
      subject.posNeg(-4, -5, false) == false
      subject.posNeg(-4, 5, false) == true
      subject.posNeg(-4, 5, true) == false
      subject.posNeg(1, 1, false) == false
      subject.posNeg(-1, -1, false) == false
      subject.posNeg(1, -1, true) == false
      subject.posNeg(-1, 1, true) == false
      subject.posNeg(1, 1, true) == false
      subject.posNeg(-1, -1, true) == true
      subject.posNeg(5, -5, false) == true
      subject.posNeg(-6, 6, false) == true
      subject.posNeg(-5, -6, false) == false
      subject.posNeg(-2, -1, false) == false
      subject.posNeg(1, 2, false) == false
      subject.posNeg(-5, 6, true) == false
      subject.posNeg(-5, -5, true) == true
  }
}

