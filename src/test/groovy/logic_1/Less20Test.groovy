package logic_1;

import spock.lang.Specification

class Less20Test extends Specification {
  def 'less20'() {
    setup:
      def subject = new Less20()
    expect:
      subject.less20(18) == true
      subject.less20(19) == true
      subject.less20(20) == false
      subject.less20(8) == false
      subject.less20(17) == false
      subject.less20(23) == false
      subject.less20(25) == false
      subject.less20(30) == false
      subject.less20(31) == false
      subject.less20(58) == true
      subject.less20(59) == true
      subject.less20(60) == false
      subject.less20(61) == false
      subject.less20(62) == false
      subject.less20(1017) == false
      subject.less20(1018) == true
      subject.less20(1019) == true
      subject.less20(1020) == false
      subject.less20(1021) == false
      subject.less20(1022) == false
      subject.less20(1023) == false
      subject.less20(37) == false
  }
}

