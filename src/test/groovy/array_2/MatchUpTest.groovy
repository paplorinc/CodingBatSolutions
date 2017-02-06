package array_2;

import spock.lang.Specification

class MatchUpTest extends Specification {
  def 'matchUp'() {
    setup:
      def subject = new MatchUp()
    expect:
      subject.matchUp([1, 2, 3] as int[], [2, 3, 10] as int[]) == 2
      subject.matchUp([1, 2, 3] as int[], [2, 3, 5] as int[]) == 3
      subject.matchUp([1, 2, 3] as int[], [2, 3, 3] as int[]) == 2
      subject.matchUp([5, 3] as int[], [5, 5] as int[]) == 1
      subject.matchUp([5, 3] as int[], [4, 4] as int[]) == 2
      subject.matchUp([5, 3] as int[], [3, 3] as int[]) == 1
      subject.matchUp([5, 3] as int[], [2, 2] as int[]) == 1
      subject.matchUp([5, 3] as int[], [1, 1] as int[]) == 1
      subject.matchUp([5, 3] as int[], [0, 0] as int[]) == 0
      subject.matchUp([4] as int[], [4] as int[]) == 0
      subject.matchUp([4] as int[], [5] as int[]) == 1
  }
}

