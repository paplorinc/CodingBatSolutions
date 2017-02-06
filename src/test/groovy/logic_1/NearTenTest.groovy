package logic_1;

import spock.lang.Specification

class NearTenTest extends Specification {
  def 'nearTen'() {
    setup:
      def subject = new NearTen()
    expect:
      subject.nearTen(12) == true
      subject.nearTen(17) == false
      subject.nearTen(19) == true
      subject.nearTen(31) == true
      subject.nearTen(6) == false
      subject.nearTen(10) == true
      subject.nearTen(11) == true
      subject.nearTen(21) == true
      subject.nearTen(22) == true
      subject.nearTen(23) == false
      subject.nearTen(54) == false
      subject.nearTen(155) == false
      subject.nearTen(158) == true
      subject.nearTen(3) == false
      subject.nearTen(1) == true
  }
}

