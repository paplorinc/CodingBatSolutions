package ap_1;

import spock.lang.Specification

class ScoresIncreasingTest extends Specification {
  def 'scoresIncreasing'() {
    setup:
      def subject = new ScoresIncreasing()
    expect:
      subject.scoresIncreasing([1, 3, 4] as int[]) == true
      subject.scoresIncreasing([1, 3, 2] as int[]) == false
      subject.scoresIncreasing([1, 1, 4] as int[]) == true
      subject.scoresIncreasing([1, 1, 2, 4, 4, 7] as int[]) == true
      subject.scoresIncreasing([1, 1, 2, 4, 3, 7] as int[]) == false
      subject.scoresIncreasing([-5, 4, 11] as int[]) == true
  }
}

