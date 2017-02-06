package logic_1;

import spock.lang.Specification

class SpecialElevenTest extends Specification {
  def 'specialEleven'() {
    setup:
      def subject = new SpecialEleven()
    expect:
      subject.specialEleven(22) == true
      subject.specialEleven(23) == true
      subject.specialEleven(24) == false
      subject.specialEleven(21) == false
      subject.specialEleven(11) == true
      subject.specialEleven(12) == true
      subject.specialEleven(10) == false
      subject.specialEleven(9) == false
      subject.specialEleven(8) == false
      subject.specialEleven(0) == true
      subject.specialEleven(1) == true
      subject.specialEleven(2) == false
      subject.specialEleven(121) == true
      subject.specialEleven(122) == true
      subject.specialEleven(123) == false
      subject.specialEleven(46) == false
      subject.specialEleven(49) == false
      subject.specialEleven(52) == false
      subject.specialEleven(54) == false
      subject.specialEleven(55) == true
  }
}

