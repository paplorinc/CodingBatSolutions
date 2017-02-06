package logic_2;

import spock.lang.Specification

class EvenlySpacedTest extends Specification {
  def 'evenlySpaced'() {
    setup:
      def subject = new EvenlySpaced()
    expect:
      subject.evenlySpaced(2, 4, 6) == true
      subject.evenlySpaced(4, 6, 2) == true
      subject.evenlySpaced(4, 6, 3) == false
      subject.evenlySpaced(6, 2, 4) == true
      subject.evenlySpaced(6, 2, 8) == false
      subject.evenlySpaced(2, 2, 2) == true
      subject.evenlySpaced(2, 2, 3) == false
      subject.evenlySpaced(9, 10, 11) == true
      subject.evenlySpaced(10, 9, 11) == true
      subject.evenlySpaced(10, 9, 9) == false
      subject.evenlySpaced(2, 4, 4) == false
      subject.evenlySpaced(2, 2, 4) == false
      subject.evenlySpaced(3, 6, 12) == false
      subject.evenlySpaced(12, 3, 6) == false
  }
}

