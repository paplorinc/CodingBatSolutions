package array_3;

import spock.lang.Specification

class SeriesUpTest extends Specification {
  def 'seriesUp'() {
    setup:
      def subject = new SeriesUp()
    expect:
      subject.seriesUp(3) == [1, 1, 2, 1, 2, 3]
      subject.seriesUp(4) == [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
      subject.seriesUp(2) == [1, 1, 2]
      subject.seriesUp(1) == [1]
      subject.seriesUp(0) == []
      subject.seriesUp(6) == [1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6]
  }
}

