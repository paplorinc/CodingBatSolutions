package logic_1;

import spock.lang.Specification

class TwoAsOneTest extends Specification {
  def 'twoAsOne'() {
    setup:
      def subject = new TwoAsOne()
    expect:
      subject.twoAsOne(1, 2, 3) == true
      subject.twoAsOne(3, 1, 2) == true
      subject.twoAsOne(3, 2, 2) == false
      subject.twoAsOne(2, 3, 1) == true
      subject.twoAsOne(5, 3, -2) == true
      subject.twoAsOne(5, 3, -3) == false
      subject.twoAsOne(2, 5, 3) == true
      subject.twoAsOne(9, 5, 5) == false
      subject.twoAsOne(9, 4, 5) == true
      subject.twoAsOne(5, 4, 9) == true
      subject.twoAsOne(3, 3, 0) == true
      subject.twoAsOne(3, 3, 2) == false
  }
}

