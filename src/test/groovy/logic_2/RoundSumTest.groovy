package logic_2;

import spock.lang.Specification

class RoundSumTest extends Specification {
  def 'roundSum'() {
    setup:
      def subject = new RoundSum()
    expect:
      subject.roundSum(16, 17, 18) == 60
      subject.roundSum(12, 13, 14) == 30
      subject.roundSum(6, 4, 4) == 10
      subject.roundSum(4, 6, 5) == 20
      subject.roundSum(4, 4, 6) == 10
      subject.roundSum(9, 4, 4) == 10
      subject.roundSum(0, 0, 1) == 0
      subject.roundSum(0, 9, 0) == 10
      subject.roundSum(10, 10, 19) == 40
      subject.roundSum(20, 30, 40) == 90
      subject.roundSum(45, 21, 30) == 100
      subject.roundSum(23, 11, 26) == 60
      subject.roundSum(23, 24, 25) == 70
      subject.roundSum(25, 24, 25) == 80
      subject.roundSum(23, 24, 29) == 70
      subject.roundSum(11, 24, 36) == 70
      subject.roundSum(24, 36, 32) == 90
      subject.roundSum(14, 12, 26) == 50
      subject.roundSum(12, 10, 24) == 40
  }
}

