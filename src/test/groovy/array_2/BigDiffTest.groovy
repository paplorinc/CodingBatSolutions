package array_2;

import spock.lang.Specification

class BigDiffTest extends Specification {
  def 'bigDiff'() {
    setup:
      def subject = new BigDiff()
    expect:
      subject.bigDiff([10, 3, 5, 6] as int[]) == 7
      subject.bigDiff([7, 2, 10, 9] as int[]) == 8
      subject.bigDiff([2, 10, 7, 2] as int[]) == 8
      subject.bigDiff([2, 10] as int[]) == 8
      subject.bigDiff([10, 2] as int[]) == 8
      subject.bigDiff([10, 0] as int[]) == 10
      subject.bigDiff([2, 3] as int[]) == 1
      subject.bigDiff([2, 2] as int[]) == 0
      subject.bigDiff([2] as int[]) == 0
      subject.bigDiff([5, 1, 6, 1, 9, 9] as int[]) == 8
      subject.bigDiff([7, 6, 8, 5] as int[]) == 3
      subject.bigDiff([7, 7, 6, 8, 5, 5, 6] as int[]) == 3
  }
}

