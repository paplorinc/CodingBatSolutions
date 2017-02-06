package warmup_1;

import spock.lang.Specification

class Diff21Test extends Specification {
  def 'diff21'() {
    setup:
      def subject = new Diff21()
    expect:
      subject.diff21(19) == 2
      subject.diff21(10) == 11
      subject.diff21(21) == 0
      subject.diff21(22) == 2
      subject.diff21(25) == 8
      subject.diff21(30) == 18
      subject.diff21(0) == 21
      subject.diff21(1) == 20
      subject.diff21(2) == 19
      subject.diff21(-1) == 22
      subject.diff21(-2) == 23
      subject.diff21(50) == 58
  }
}

