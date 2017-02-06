package warmup_1;

import spock.lang.Specification

class IcyHotTest extends Specification {
  def 'icyHot'() {
    setup:
      def subject = new IcyHot()
    expect:
      subject.icyHot(120, -1) == true
      subject.icyHot(-1, 120) == true
      subject.icyHot(2, 120) == false
      subject.icyHot(-1, 100) == false
      subject.icyHot(-2, -2) == false
      subject.icyHot(120, 120) == false
  }
}

