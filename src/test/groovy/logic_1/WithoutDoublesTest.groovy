package logic_1;

import spock.lang.Specification

class WithoutDoublesTest extends Specification {
  def 'withoutDoubles'() {
    setup:
      def subject = new WithoutDoubles()
    expect:
      subject.withoutDoubles(2, 3, true) == 5
      subject.withoutDoubles(3, 3, true) == 7
      subject.withoutDoubles(3, 3, false) == 6
      subject.withoutDoubles(2, 3, false) == 5
      subject.withoutDoubles(5, 4, true) == 9
      subject.withoutDoubles(5, 4, false) == 9
      subject.withoutDoubles(5, 5, true) == 11
      subject.withoutDoubles(5, 5, false) == 10
      subject.withoutDoubles(6, 6, true) == 7
      subject.withoutDoubles(6, 6, false) == 12
      subject.withoutDoubles(1, 6, true) == 7
      subject.withoutDoubles(6, 1, false) == 7
  }
}

