package warmup_1;

import spock.lang.Specification

class In1020Test extends Specification {
  def 'in1020'() {
    setup:
      def subject = new In1020()
    expect:
      subject.in1020(12, 99) == true
      subject.in1020(21, 12) == true
      subject.in1020(8, 99) == false
      subject.in1020(99, 10) == true
      subject.in1020(20, 20) == true
      subject.in1020(21, 21) == false
      subject.in1020(9, 9) == false
  }
}

