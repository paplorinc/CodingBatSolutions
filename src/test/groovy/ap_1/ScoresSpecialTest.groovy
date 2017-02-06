package ap_1;

import spock.lang.Specification

class ScoresSpecialTest extends Specification {
  def 'scoresSpecial'() {
    setup:
      def subject = new ScoresSpecial()
    expect:
      subject.scoresSpecial([12, 10, 4] as int[], [2, 20, 30] as int[]) == 40
      subject.scoresSpecial([20, 10, 4] as int[], [2, 20, 10] as int[]) == 40
      subject.scoresSpecial([12, 11, 4] as int[], [2, 20, 31] as int[]) == 20
      subject.scoresSpecial([1, 20, 2, 50] as int[], [3, 4, 5] as int[]) == 50
      subject.scoresSpecial([3, 4, 5] as int[], [1, 50, 2, 20] as int[]) == 50
      subject.scoresSpecial([10, 4, 20, 30] as int[], [20] as int[]) == 50
      subject.scoresSpecial([10, 4, 20, 30] as int[], [20] as int[]) == 50
      subject.scoresSpecial([10, 4, 20, 30] as int[], [3, 20, 99] as int[]) == 50
      subject.scoresSpecial([10, 4, 20, 30] as int[], [30, 20, 99] as int[]) == 60
      subject.scoresSpecial([] as int[], [2] as int[]) == 0
      subject.scoresSpecial([] as int[], [20] as int[]) == 20
      subject.scoresSpecial([14, 10, 4] as int[], [4, 20, 30] as int[]) == 40
  }
}

