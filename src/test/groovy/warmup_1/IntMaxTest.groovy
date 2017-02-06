package warmup_1;

import spock.lang.Specification

class IntMaxTest extends Specification {
  def 'intMax'() {
    setup:
      def subject = new IntMax()
    expect:
      subject.intMax(1, 2, 3) == 3
      subject.intMax(1, 3, 2) == 3
      subject.intMax(3, 2, 1) == 3
      subject.intMax(9, 3, 3) == 9
      subject.intMax(3, 9, 3) == 9
      subject.intMax(3, 3, 9) == 9
      subject.intMax(8, 2, 3) == 8
      subject.intMax(-3, -1, -2) == -1
      subject.intMax(6, 2, 5) == 6
      subject.intMax(5, 6, 2) == 6
      subject.intMax(5, 2, 6) == 6
  }
}

