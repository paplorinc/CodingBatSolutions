package array_2;

import spock.lang.Specification

class CenteredAverageTest extends Specification {
  def 'centeredAverage'() {
    setup:
      def subject = new CenteredAverage()
    expect:
      subject.centeredAverage([1, 2, 3, 4, 100] as int[]) == 3
      subject.centeredAverage([1, 1, 5, 5, 10, 8, 7] as int[]) == 5
      subject.centeredAverage([-10, -4, -2, -4, -2, 0] as int[]) == -3
      subject.centeredAverage([5, 3, 4, 6, 2] as int[]) == 4
      subject.centeredAverage([5, 3, 4, 0, 100] as int[]) == 4
      subject.centeredAverage([100, 0, 5, 3, 4] as int[]) == 4
      subject.centeredAverage([4, 0, 100] as int[]) == 4
      subject.centeredAverage([0, 2, 3, 4, 100] as int[]) == 3
      subject.centeredAverage([1, 1, 100] as int[]) == 1
      subject.centeredAverage([7, 7, 7] as int[]) == 7
      subject.centeredAverage([1, 7, 8] as int[]) == 7
      subject.centeredAverage([1, 1, 99, 99] as int[]) == 50
      subject.centeredAverage([1000, 0, 1, 99] as int[]) == 50
      subject.centeredAverage([4, 4, 4, 4, 5] as int[]) == 4
      subject.centeredAverage([4, 4, 4, 1, 5] as int[]) == 4
      subject.centeredAverage([6, 4, 8, 12, 3] as int[]) == 6
  }
}

