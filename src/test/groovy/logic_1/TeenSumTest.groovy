package logic_1;

import spock.lang.Specification

class TeenSumTest extends Specification {
  def 'teenSum'() {
    setup:
      def subject = new TeenSum()
    expect:
      subject.teenSum(3, 4) == 7
      subject.teenSum(10, 13) == 19
      subject.teenSum(13, 2) == 19
      subject.teenSum(3, 19) == 19
      subject.teenSum(13, 13) == 19
      subject.teenSum(10, 10) == 20
      subject.teenSum(6, 14) == 19
      subject.teenSum(15, 2) == 19
      subject.teenSum(19, 19) == 19
      subject.teenSum(19, 20) == 19
      subject.teenSum(2, 18) == 19
      subject.teenSum(12, 4) == 16
      subject.teenSum(2, 20) == 22
      subject.teenSum(2, 17) == 19
      subject.teenSum(2, 16) == 19
      subject.teenSum(6, 7) == 13
  }
}

