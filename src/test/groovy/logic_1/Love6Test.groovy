package logic_1;

import spock.lang.Specification

class Love6Test extends Specification {
  def 'love6'() {
    setup:
      def subject = new Love6()
    expect:
      subject.love6(6, 4) == true
      subject.love6(4, 5) == false
      subject.love6(1, 5) == true
      subject.love6(1, 6) == true
      subject.love6(1, 8) == false
      subject.love6(1, 7) == true
      subject.love6(7, 5) == false
      subject.love6(8, 2) == true
      subject.love6(6, 6) == true
      subject.love6(-6, 2) == false
      subject.love6(-4, -10) == true
      subject.love6(-7, 1) == false
      subject.love6(7, -1) == true
      subject.love6(-6, 12) == true
      subject.love6(-2, -4) == false
      subject.love6(7, 1) == true
      subject.love6(0, 9) == false
      subject.love6(8, 3) == false
      subject.love6(3, 3) == true
      subject.love6(3, 4) == false
  }
}

