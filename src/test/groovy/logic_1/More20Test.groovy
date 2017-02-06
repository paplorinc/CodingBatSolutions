package logic_1;

import spock.lang.Specification

class More20Test extends Specification {
  def 'more20'() {
    setup:
      def subject = new More20()
    expect:
      subject.more20(20) == false
      subject.more20(21) == true
      subject.more20(22) == true
      subject.more20(23) == false
      subject.more20(25) == false
      subject.more20(30) == false
      subject.more20(31) == false
      subject.more20(59) == false
      subject.more20(60) == false
      subject.more20(61) == true
      subject.more20(62) == true
      subject.more20(1020) == false
      subject.more20(1021) == true
      subject.more20(1000) == false
      subject.more20(1001) == true
      subject.more20(50) == false
      subject.more20(55) == false
      subject.more20(40) == false
      subject.more20(41) == true
      subject.more20(39) == false
      subject.more20(42) == true
  }
}

