package array_3;

import spock.lang.Specification

class CountClumpsTest extends Specification {
  def 'countClumps'() {
    setup:
      def subject = new CountClumps()
    expect:
      subject.countClumps([1, 2, 2, 3, 4, 4] as int[]) == 2
      subject.countClumps([1, 1, 2, 1, 1] as int[]) == 2
      subject.countClumps([1, 1, 1, 1, 1] as int[]) == 1
      subject.countClumps([1, 2, 3] as int[]) == 0
      subject.countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2] as int[]) == 4
      subject.countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2] as int[]) == 4
      subject.countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2] as int[]) == 5
      subject.countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2] as int[]) == 5
      subject.countClumps([] as int[]) == 0
  }
}

