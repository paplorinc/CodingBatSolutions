package logic_1;

import spock.lang.Specification

class SumLimitTest extends Specification {
  def 'sumLimit'() {
    setup:
      def subject = new SumLimit()
    expect:
      subject.sumLimit(2, 3) == 5
      subject.sumLimit(8, 3) == 8
      subject.sumLimit(8, 1) == 9
      subject.sumLimit(11, 39) == 50
      subject.sumLimit(11, 99) == 11
      subject.sumLimit(0, 0) == 0
      subject.sumLimit(99, 0) == 99
      subject.sumLimit(99, 1) == 99
      subject.sumLimit(123, 1) == 124
      subject.sumLimit(1, 123) == 1
      subject.sumLimit(23, 60) == 83
      subject.sumLimit(23, 80) == 23
      subject.sumLimit(9000, 1) == 9001
      subject.sumLimit(90000000, 1) == 90000001
      subject.sumLimit(9000, 1000) == 9000
  }
}

