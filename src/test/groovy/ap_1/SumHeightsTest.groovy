package ap_1;

import spock.lang.Specification

class SumHeightsTest extends Specification {
  def 'sumHeights'() {
    setup:
      def subject = new SumHeights()
    expect:
      subject.sumHeights([5, 3, 6, 7, 2] as int[], 2, 4) == 6
      subject.sumHeights([5, 3, 6, 7, 2] as int[], 0, 1) == 2
      subject.sumHeights([5, 3, 6, 7, 2] as int[], 0, 4) == 11
      subject.sumHeights([5, 3, 6, 7, 2] as int[], 1, 1) == 0
      subject.sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 0, 3) == 3
      subject.sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 4, 8) == 11
      subject.sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 7, 8) == 8
      subject.sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 8, 8) == 0
      subject.sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 2, 2) == 0
      subject.sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 3, 6) == 3
      subject.sumHeights([10, 8, 7, 7, 7, 6, 7] as int[], 1, 4) == 1
      subject.sumHeights([10, 8, 7, 7, 7, 6, 7] as int[], 1, 5) == 2
  }
}

