package array_3;

import spock.lang.Specification

class SquareUpTest extends Specification {
  def 'squareUp'() {
    setup:
      def subject = new SquareUp()
    expect:
      subject.squareUp(3) == [0, 0, 1, 0, 2, 1, 3, 2, 1]
      subject.squareUp(2) == [0, 1, 2, 1]
      subject.squareUp(4) == [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
      subject.squareUp(1) == [1]
      subject.squareUp(0) == []
      subject.squareUp(6) == [0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1]
  }
}

