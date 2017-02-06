package array_1;

import spock.lang.Specification

class Make2Test extends Specification {
  def 'make2'() {
    setup:
      def subject = new Make2()
    expect:
      subject.make2([4, 5] as int[], [1, 2, 3] as int[]) == [4, 5]
      subject.make2([4] as int[], [1, 2, 3] as int[]) == [4, 1]
      subject.make2([] as int[], [1, 2] as int[]) == [1, 2]
      subject.make2([1, 2] as int[], [] as int[]) == [1, 2]
      subject.make2([3] as int[], [1, 2, 3] as int[]) == [3, 1]
      subject.make2([3] as int[], [1] as int[]) == [3, 1]
      subject.make2([3, 1, 4] as int[], [] as int[]) == [3, 1]
      subject.make2([1] as int[], [1] as int[]) == [1, 1]
      subject.make2([1, 2, 3] as int[], [7, 8] as int[]) == [1, 2]
      subject.make2([7, 8] as int[], [1, 2, 3] as int[]) == [7, 8]
      subject.make2([7] as int[], [1, 2, 3] as int[]) == [7, 1]
      subject.make2([5, 4] as int[], [2, 3, 7] as int[]) == [5, 4]
  }
}

