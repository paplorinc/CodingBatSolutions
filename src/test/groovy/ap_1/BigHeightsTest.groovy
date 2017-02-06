package ap_1;

import spock.lang.Specification

class BigHeightsTest extends Specification {
  def 'bigHeights'() {
    setup:
      def subject = new BigHeights()
    expect:
      subject.bigHeights([5, 3, 6, 7, 2] as int[], 2, 4) == 1
      subject.bigHeights([5, 3, 6, 7, 2] as int[], 0, 1) == 0
      subject.bigHeights([5, 3, 6, 7, 2] as int[], 0, 4) == 1
      subject.bigHeights([5, 3, 6, 7, 3] as int[], 0, 4) == 0
      subject.bigHeights([5, 3, 6, 7, 2] as int[], 1, 1) == 0
      subject.bigHeights([5, 13, 6, 7, 2] as int[], 1, 2) == 1
      subject.bigHeights([5, 13, 6, 7, 2] as int[], 0, 2) == 2
      subject.bigHeights([5, 13, 6, 7, 2] as int[], 1, 4) == 2
      subject.bigHeights([5, 13, 6, 7, 2] as int[], 0, 4) == 3
      subject.bigHeights([5, 13, 6, 7, 2] as int[], 0, 3) == 2
      subject.bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 0, 3) == 0
      subject.bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10] as int[], 4, 8) == 1
      subject.bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10] as int[], 0, 3) == 1
      subject.bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10] as int[], 7, 8) == 1
      subject.bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10] as int[], 3, 8) == 2
      subject.bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10] as int[], 2, 8) == 3
  }
}

