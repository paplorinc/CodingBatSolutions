package array_1;

import spock.lang.Specification

class PlusTwoTest extends Specification {
  def 'plusTwo'() {
    setup:
      def subject = new PlusTwo()
    expect:
      subject.plusTwo([1, 2] as int[], [3, 4] as int[]) == [1, 2, 3, 4]
      subject.plusTwo([4, 4] as int[], [2, 2] as int[]) == [4, 4, 2, 2]
      subject.plusTwo([9, 2] as int[], [3, 4] as int[]) == [9, 2, 3, 4]
  }
}

