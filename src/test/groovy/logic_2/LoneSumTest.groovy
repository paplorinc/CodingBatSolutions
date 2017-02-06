package logic_2;

import spock.lang.Specification

class LoneSumTest extends Specification {
  def 'loneSum'() {
    setup:
      def subject = new LoneSum()
    expect:
      subject.loneSum(1, 2, 3) == 6
      subject.loneSum(3, 2, 3) == 2
      subject.loneSum(3, 3, 3) == 0
      subject.loneSum(9, 2, 2) == 9
      subject.loneSum(2, 2, 9) == 9
      subject.loneSum(2, 9, 2) == 9
      subject.loneSum(2, 9, 3) == 14
      subject.loneSum(4, 2, 3) == 9
      subject.loneSum(1, 3, 1) == 3
  }
}

