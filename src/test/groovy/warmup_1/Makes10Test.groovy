package warmup_1;

import spock.lang.Specification

class Makes10Test extends Specification {
  def 'makes10'() {
    setup:
      def subject = new Makes10()
    expect:
      subject.makes10(9, 10) == true
      subject.makes10(9, 9) == false
      subject.makes10(1, 9) == true
      subject.makes10(10, 1) == true
      subject.makes10(10, 10) == true
      subject.makes10(8, 2) == true
      subject.makes10(8, 3) == false
      subject.makes10(10, 42) == true
      subject.makes10(12, -2) == true
  }
}

