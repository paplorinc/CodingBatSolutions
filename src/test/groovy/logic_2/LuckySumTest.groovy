package logic_2;

import spock.lang.Specification

class LuckySumTest extends Specification {
  def 'luckySum'() {
    setup:
      def subject = new LuckySum()
    expect:
      subject.luckySum(1, 2, 3) == 6
      subject.luckySum(1, 2, 13) == 3
      subject.luckySum(1, 13, 3) == 1
      subject.luckySum(1, 13, 13) == 1
      subject.luckySum(6, 5, 2) == 13
      subject.luckySum(13, 2, 3) == 0
      subject.luckySum(13, 2, 13) == 0
      subject.luckySum(13, 13, 2) == 0
      subject.luckySum(9, 4, 13) == 13
      subject.luckySum(8, 13, 2) == 8
      subject.luckySum(7, 2, 1) == 10
      subject.luckySum(3, 3, 13) == 6
  }
}

