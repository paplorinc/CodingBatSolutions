package recursion_1;

import spock.lang.Specification

class PowerNTest extends Specification {
  def 'powerN'() {
    setup:
      def subject = new PowerN()
    expect:
      subject.powerN(3, 1) == 3
      subject.powerN(3, 2) == 9
      subject.powerN(3, 3) == 27
      subject.powerN(2, 1) == 2
      subject.powerN(2, 2) == 4
      subject.powerN(2, 3) == 8
      subject.powerN(2, 4) == 16
      subject.powerN(2, 5) == 32
      subject.powerN(10, 1) == 10
      subject.powerN(10, 2) == 100
      subject.powerN(10, 3) == 1000
  }
}

