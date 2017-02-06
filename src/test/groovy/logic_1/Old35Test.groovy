package logic_1;

import spock.lang.Specification

class Old35Test extends Specification {
  def 'old35'() {
    setup:
      def subject = new Old35()
    expect:
      subject.old35(3) == true
      subject.old35(10) == true
      subject.old35(15) == false
      subject.old35(5) == true
      subject.old35(9) == true
      subject.old35(8) == false
      subject.old35(7) == false
      subject.old35(6) == true
      subject.old35(17) == false
      subject.old35(18) == true
      subject.old35(29) == false
      subject.old35(20) == true
      subject.old35(21) == true
      subject.old35(22) == false
      subject.old35(45) == false
      subject.old35(99) == true
  }
}

