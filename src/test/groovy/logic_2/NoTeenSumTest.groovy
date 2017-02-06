package logic_2;

import spock.lang.Specification

class NoTeenSumTest extends Specification {
  def 'noTeenSum'() {
    setup:
      def subject = new NoTeenSum()
    expect:
      subject.noTeenSum(1, 2, 3) == 6
      subject.noTeenSum(2, 13, 1) == 3
      subject.noTeenSum(2, 1, 14) == 3
      subject.noTeenSum(2, 1, 15) == 18
      subject.noTeenSum(2, 1, 16) == 19
      subject.noTeenSum(2, 1, 17) == 3
      subject.noTeenSum(17, 1, 2) == 3
      subject.noTeenSum(2, 15, 2) == 19
      subject.noTeenSum(16, 17, 18) == 16
      subject.noTeenSum(17, 18, 19) == 0
      subject.noTeenSum(15, 16, 1) == 32
      subject.noTeenSum(15, 15, 19) == 30
      subject.noTeenSum(15, 19, 16) == 31
      subject.noTeenSum(5, 17, 18) == 5
      subject.noTeenSum(17, 18, 16) == 16
      subject.noTeenSum(17, 19, 18) == 0
  }
}

