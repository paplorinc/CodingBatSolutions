package array_1;

import spock.lang.Specification

class Front11Test extends Specification {
  def 'front11'() {
    setup:
      def subject = new Front11()
    expect:
      subject.front11([1, 2, 3] as int[], [7, 9, 8] as int[]) == [1, 7]
      subject.front11([1] as int[], [2] as int[]) == [1, 2]
      subject.front11([1, 7] as int[], [] as int[]) == [1]
      subject.front11([] as int[], [2, 8] as int[]) == [2]
      subject.front11([] as int[], [] as int[]) == []
      subject.front11([3] as int[], [1, 4, 1, 9] as int[]) == [3, 1]
      subject.front11([1, 4, 1, 9] as int[], [] as int[]) == [1]
  }
}

