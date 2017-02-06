package ap_1;

import spock.lang.Specification

class ScoresAverageTest extends Specification {
  def 'scoresAverage'() {
    setup:
      def subject = new ScoresAverage()
    expect:
      subject.scoresAverage([2, 2, 4, 4] as int[]) == 4
      subject.scoresAverage([4, 4, 4, 2, 2, 2] as int[]) == 4
      subject.scoresAverage([3, 4, 5, 1, 2, 3] as int[]) == 4
      subject.scoresAverage([5, 6] as int[]) == 6
      subject.scoresAverage([5, 4] as int[]) == 5
      subject.scoresAverage([5, 4, 5, 6, 2, 1, 2, 3] as int[]) == 5
  }
}

