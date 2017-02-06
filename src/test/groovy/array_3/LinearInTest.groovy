package array_3;

import spock.lang.Specification

class LinearInTest extends Specification {
  def 'linearIn'() {
    setup:
      def subject = new LinearIn()
    expect:
      subject.linearIn([1, 2, 4, 6] as int[], [2, 4] as int[]) == true
      subject.linearIn([1, 2, 4, 6] as int[], [2, 3, 4] as int[]) == false
      subject.linearIn([1, 2, 4, 4, 6] as int[], [2, 4] as int[]) == true
      subject.linearIn([2, 2, 4, 4, 6, 6] as int[], [2, 4] as int[]) == true
      subject.linearIn([2, 2, 2, 2, 2] as int[], [2, 2] as int[]) == true
      subject.linearIn([2, 2, 2, 2, 2] as int[], [2, 4] as int[]) == false
      subject.linearIn([2, 2, 2, 2, 4] as int[], [2, 4] as int[]) == true
      subject.linearIn([1, 2, 3] as int[], [2] as int[]) == true
      subject.linearIn([1, 2, 3] as int[], [-1] as int[]) == false
      subject.linearIn([1, 2, 3] as int[], [] as int[]) == true
      subject.linearIn([-1, 0, 3, 3, 3, 10, 12] as int[], [-1, 0, 3, 12] as int[]) == true
      subject.linearIn([-1, 0, 3, 3, 3, 10, 12] as int[], [0, 3, 12, 14] as int[]) == false
      subject.linearIn([-1, 0, 3, 3, 3, 10, 12] as int[], [-1, 10, 11] as int[]) == false
  }
}

