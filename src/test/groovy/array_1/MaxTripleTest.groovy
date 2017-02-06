package array_1;

import spock.lang.Specification

class MaxTripleTest extends Specification {
  def 'maxTriple'() {
    setup:
      def subject = new MaxTriple()
    expect:
      subject.maxTriple([1, 2, 3] as int[]) == 3
      subject.maxTriple([1, 5, 3] as int[]) == 5
      subject.maxTriple([5, 2, 3] as int[]) == 5
      subject.maxTriple([1, 2, 3, 1, 1] as int[]) == 3
      subject.maxTriple([1, 7, 3, 1, 5] as int[]) == 5
      subject.maxTriple([5, 1, 3, 7, 1] as int[]) == 5
      subject.maxTriple([5, 1, 7, 3, 7, 8, 1] as int[]) == 5
      subject.maxTriple([5, 1, 7, 9, 7, 8, 1] as int[]) == 9
      subject.maxTriple([5, 1, 7, 3, 7, 8, 9] as int[]) == 9
      subject.maxTriple([2, 2, 5, 1, 1] as int[]) == 5
  }
}

