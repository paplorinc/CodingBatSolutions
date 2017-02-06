package array_1;

import spock.lang.Specification

class SwapEndsTest extends Specification {
  def 'swapEnds'() {
    setup:
      def subject = new SwapEnds()
    expect:
      subject.swapEnds([1, 2, 3, 4] as int[]) == [4, 2, 3, 1]
      subject.swapEnds([1, 2, 3] as int[]) == [3, 2, 1]
      subject.swapEnds([8, 6, 7, 9, 5] as int[]) == [5, 6, 7, 9, 8]
      subject.swapEnds([3, 1, 4, 1, 5, 9] as int[]) == [9, 1, 4, 1, 5, 3]
      subject.swapEnds([1, 2] as int[]) == [2, 1]
      subject.swapEnds([1] as int[]) == [1]
  }
}

