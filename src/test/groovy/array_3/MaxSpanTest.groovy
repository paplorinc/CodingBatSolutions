package array_3;

import spock.lang.Specification

class MaxSpanTest extends Specification {
  def 'maxSpan'() {
    setup:
      def subject = new MaxSpan()
    expect:
      subject.maxSpan([1, 2, 1, 1, 3] as int[]) == 4
      subject.maxSpan([1, 4, 2, 1, 4, 1, 4] as int[]) == 6
      subject.maxSpan([1, 4, 2, 1, 4, 4, 4] as int[]) == 6
      subject.maxSpan([3, 3, 3] as int[]) == 3
      subject.maxSpan([3, 9, 3] as int[]) == 3
      subject.maxSpan([3, 9, 9] as int[]) == 2
      subject.maxSpan([3, 9] as int[]) == 1
      subject.maxSpan([3, 3] as int[]) == 2
      subject.maxSpan([] as int[]) == 0
      subject.maxSpan([1] as int[]) == 1
  }
}

