package logic_2;

import spock.lang.Specification

class CloseFarTest extends Specification {
  def 'closeFar'() {
    setup:
      def subject = new CloseFar()
    expect:
      subject.closeFar(1, 2, 10) == true
      subject.closeFar(1, 2, 3) == false
      subject.closeFar(4, 1, 3) == true
      subject.closeFar(4, 5, 3) == false
      subject.closeFar(4, 3, 5) == false
      subject.closeFar(-1, 10, 0) == true
      subject.closeFar(0, -1, 10) == true
      subject.closeFar(10, 10, 8) == true
      subject.closeFar(10, 8, 9) == false
      subject.closeFar(8, 9, 10) == false
      subject.closeFar(8, 9, 7) == false
      subject.closeFar(8, 6, 9) == true
  }
}

