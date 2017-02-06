package logic_1;

import spock.lang.Specification

class LessBy10Test extends Specification {
  def 'lessBy10'() {
    setup:
      def subject = new LessBy10()
    expect:
      subject.lessBy10(1, 7, 11) == true
      subject.lessBy10(1, 7, 10) == false
      subject.lessBy10(11, 1, 7) == true
      subject.lessBy10(10, 7, 1) == false
      subject.lessBy10(-10, 2, 2) == true
      subject.lessBy10(2, 11, 11) == false
      subject.lessBy10(3, 3, 30) == true
      subject.lessBy10(3, 3, 3) == false
      subject.lessBy10(10, 1, 11) == true
      subject.lessBy10(10, 11, 1) == true
      subject.lessBy10(10, 11, 2) == false
      subject.lessBy10(3, 30, 3) == true
      subject.lessBy10(2, 2, -8) == true
      subject.lessBy10(2, 8, 12) == true
  }
}

