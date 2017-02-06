package warmup_1;

import spock.lang.Specification

class Max1020Test extends Specification {
  def 'max1020'() {
    setup:
      def subject = new Max1020()
    expect:
      subject.max1020(11, 19) == 19
      subject.max1020(19, 11) == 19
      subject.max1020(11, 9) == 11
      subject.max1020(9, 21) == 0
      subject.max1020(10, 21) == 10
      subject.max1020(21, 10) == 10
      subject.max1020(9, 11) == 11
      subject.max1020(23, 10) == 10
      subject.max1020(20, 10) == 20
      subject.max1020(7, 20) == 20
      subject.max1020(17, 16) == 17
  }
}

