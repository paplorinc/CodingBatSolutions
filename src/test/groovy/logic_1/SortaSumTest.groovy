package logic_1;

import spock.lang.Specification

class SortaSumTest extends Specification {
  def 'sortaSum'() {
    setup:
      def subject = new SortaSum()
    expect:
      subject.sortaSum(3, 4) == 7
      subject.sortaSum(9, 4) == 20
      subject.sortaSum(10, 11) == 21
      subject.sortaSum(12, -3) == 9
      subject.sortaSum(-3, 12) == 9
      subject.sortaSum(4, 5) == 9
      subject.sortaSum(4, 6) == 20
      subject.sortaSum(14, 7) == 21
      subject.sortaSum(14, 6) == 20
  }
}

