package ap_1;

import spock.lang.Specification

class SumHeights2Test extends Specification {
  def 'sumHeights2'() {
    setup:
      def subject = new SumHeights2()
    expect:
      subject.sumHeights2([5, 3, 6, 7, 2] as int[], 2, 4) == 7
      subject.sumHeights2([5, 3, 6, 7, 2] as int[], 0, 1) == 2
      subject.sumHeights2([5, 3, 6, 7, 2] as int[], 0, 4) == 15
      subject.sumHeights2([5, 3, 6, 7, 2] as int[], 1, 1) == 0
      subject.sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 0, 3) == 6
      subject.sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 4, 8) == 19
      subject.sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 7, 8) == 16
      subject.sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 8, 8) == 0
      subject.sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 2, 2) == 0
      subject.sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 3, 6) == 4
      subject.sumHeights2([10, 8, 7, 7, 7, 6, 7] as int[], 1, 4) == 1
      subject.sumHeights2([10, 8, 7, 7, 7, 6, 7] as int[], 1, 5) == 2
  }
}

