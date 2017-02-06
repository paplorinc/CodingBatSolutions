package ap_1;

import spock.lang.Specification

class ScoresClumpTest extends Specification {
  def 'scoresClump'() {
    setup:
      def subject = new ScoresClump()
    expect:
      subject.scoresClump([3, 4, 5] as int[]) == true
      subject.scoresClump([3, 4, 6] as int[]) == false
      subject.scoresClump([1, 3, 5, 5] as int[]) == true
      subject.scoresClump([2, 4, 5, 6] as int[]) == true
      subject.scoresClump([2, 4, 5, 7] as int[]) == false
      subject.scoresClump([2, 4, 4, 7] as int[]) == true
      subject.scoresClump([3, 3, 6, 7, 9] as int[]) == false
      subject.scoresClump([3, 3, 7, 7, 9] as int[]) == true
      subject.scoresClump([4, 5, 8] as int[]) == false
  }
}

