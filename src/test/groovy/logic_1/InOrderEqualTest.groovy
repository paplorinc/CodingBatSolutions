package logic_1;

import spock.lang.Specification

class InOrderEqualTest extends Specification {
  def 'inOrderEqual'() {
    setup:
      def subject = new InOrderEqual()
    expect:
      subject.inOrderEqual(2, 5, 11, false) == true
      subject.inOrderEqual(5, 7, 6, false) == false
      subject.inOrderEqual(5, 5, 7, true) == true
      subject.inOrderEqual(5, 5, 7, false) == false
      subject.inOrderEqual(2, 5, 4, false) == false
      subject.inOrderEqual(3, 4, 3, false) == false
      subject.inOrderEqual(3, 4, 4, false) == false
      subject.inOrderEqual(3, 4, 3, true) == false
      subject.inOrderEqual(3, 4, 4, true) == true
      subject.inOrderEqual(1, 5, 5, true) == true
      subject.inOrderEqual(5, 5, 5, true) == true
      subject.inOrderEqual(2, 2, 1, true) == false
      subject.inOrderEqual(9, 2, 2, true) == false
      subject.inOrderEqual(0, 1, 0, true) == false
  }
}

