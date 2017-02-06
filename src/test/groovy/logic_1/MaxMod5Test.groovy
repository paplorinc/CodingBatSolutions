package logic_1;

import spock.lang.Specification

class MaxMod5Test extends Specification {
  def 'maxMod5'() {
    setup:
      def subject = new MaxMod5()
    expect:
      subject.maxMod5(2, 3) == 3
      subject.maxMod5(6, 2) == 6
      subject.maxMod5(3, 2) == 3
      subject.maxMod5(8, 12) == 12
      subject.maxMod5(7, 12) == 7
      subject.maxMod5(11, 6) == 6
      subject.maxMod5(2, 7) == 2
      subject.maxMod5(7, 7) == 0
      subject.maxMod5(9, 1) == 9
      subject.maxMod5(9, 14) == 9
      subject.maxMod5(1, 2) == 2
  }
}

