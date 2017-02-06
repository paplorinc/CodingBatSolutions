package warmup_1;

import spock.lang.Specification

class Or35Test extends Specification {
  def 'or35'() {
    setup:
      def subject = new Or35()
    expect:
      subject.or35(3) == true
      subject.or35(10) == true
      subject.or35(8) == false
      subject.or35(15) == true
      subject.or35(5) == true
      subject.or35(9) == true
      subject.or35(4) == false
      subject.or35(7) == false
      subject.or35(6) == true
      subject.or35(17) == false
      subject.or35(18) == true
      subject.or35(29) == false
      subject.or35(20) == true
      subject.or35(21) == true
      subject.or35(22) == false
      subject.or35(45) == true
      subject.or35(99) == true
      subject.or35(100) == true
      subject.or35(101) == false
      subject.or35(121) == false
      subject.or35(122) == false
      subject.or35(123) == true
  }
}

