package logic_1;

import spock.lang.Specification

class InOrderTest extends Specification {
  def 'inOrder'() {
    setup:
      def subject = new InOrder()
    expect:
      subject.inOrder(1, 2, 4, false) == true
      subject.inOrder(1, 2, 1, false) == false
      subject.inOrder(1, 1, 2, true) == true
      subject.inOrder(3, 2, 4, false) == false
      subject.inOrder(2, 3, 4, false) == true
      subject.inOrder(3, 2, 4, true) == true
      subject.inOrder(4, 2, 2, true) == false
      subject.inOrder(4, 5, 2, true) == false
      subject.inOrder(2, 4, 6, true) == true
      subject.inOrder(7, 9, 10, false) == true
      subject.inOrder(7, 5, 6, true) == true
      subject.inOrder(7, 5, 4, true) == false
  }
}

