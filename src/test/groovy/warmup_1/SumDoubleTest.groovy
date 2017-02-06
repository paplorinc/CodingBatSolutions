package warmup_1;

import spock.lang.Specification

class SumDoubleTest extends Specification {
  def 'sumDouble'() {
    setup:
      def subject = new SumDouble()
    expect:
      subject.sumDouble(1, 2) == 3
      subject.sumDouble(3, 2) == 5
      subject.sumDouble(2, 2) == 8
      subject.sumDouble(-1, 0) == -1
      subject.sumDouble(3, 3) == 12
      subject.sumDouble(0, 0) == 0
      subject.sumDouble(0, 1) == 1
      subject.sumDouble(3, 4) == 7
  }
}

