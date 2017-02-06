package array_1;

import spock.lang.Specification

class BiggerTwoTest extends Specification {
  def 'biggerTwo'() {
    setup:
      def subject = new BiggerTwo()
    expect:
      subject.biggerTwo([1, 2] as int[], [3, 4] as int[]) == [3, 4]
      subject.biggerTwo([3, 4] as int[], [1, 2] as int[]) == [3, 4]
      subject.biggerTwo([1, 1] as int[], [1, 2] as int[]) == [1, 2]
      subject.biggerTwo([2, 1] as int[], [1, 1] as int[]) == [2, 1]
      subject.biggerTwo([2, 2] as int[], [1, 3] as int[]) == [2, 2]
      subject.biggerTwo([1, 3] as int[], [2, 2] as int[]) == [1, 3]
      subject.biggerTwo([6, 7] as int[], [3, 1] as int[]) == [6, 7]
  }
}

