package array_1;

import spock.lang.Specification

class MakeEndsTest extends Specification {
  def 'makeEnds'() {
    setup:
      def subject = new MakeEnds()
    expect:
      subject.makeEnds([1, 2, 3] as int[]) == [1, 3]
      subject.makeEnds([1, 2, 3, 4] as int[]) == [1, 4]
      subject.makeEnds([7, 4, 6, 2] as int[]) == [7, 2]
      subject.makeEnds([1, 2, 2, 2, 2, 2, 2, 3] as int[]) == [1, 3]
      subject.makeEnds([7, 4] as int[]) == [7, 4]
      subject.makeEnds([7] as int[]) == [7, 7]
      subject.makeEnds([5, 2, 9] as int[]) == [5, 9]
      subject.makeEnds([2, 3, 4, 1] as int[]) == [2, 1]
  }
}

