package logic_1;

import spock.lang.Specification

class In1To10Test extends Specification {
  def 'in1To10'() {
    setup:
      def subject = new In1To10()
    expect:
      subject.in1To10(5, false) == true
      subject.in1To10(11, false) == false
      subject.in1To10(11, true) == true
      subject.in1To10(10, false) == true
      subject.in1To10(10, true) == true
      subject.in1To10(9, false) == true
      subject.in1To10(9, true) == false
      subject.in1To10(1, false) == true
      subject.in1To10(1, true) == true
      subject.in1To10(0, false) == false
      subject.in1To10(0, true) == true
      subject.in1To10(-1, false) == false
  }
}

