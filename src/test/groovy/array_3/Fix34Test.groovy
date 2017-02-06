package array_3;

import spock.lang.Specification

class Fix34Test extends Specification {
  def 'fix34'() {
    setup:
      def subject = new Fix34()
    expect:
      subject.fix34([1, 3, 1, 4] as int[]) == [1, 3, 4, 1]
      subject.fix34([1, 3, 1, 4, 4, 3, 1] as int[]) == [1, 3, 4, 1, 1, 3, 4]
      subject.fix34([3, 2, 2, 4] as int[]) == [3, 4, 2, 2]
      subject.fix34([3, 2, 3, 2, 4, 4] as int[]) == [3, 4, 3, 4, 2, 2]
      subject.fix34([2, 3, 2, 3, 2, 4, 4] as int[]) == [2, 3, 4, 3, 4, 2, 2]
      subject.fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5] as int[]) == [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]
      subject.fix34([3, 1, 4] as int[]) == [3, 4, 1]
      subject.fix34([3, 4, 1] as int[]) == [3, 4, 1]
      subject.fix34([1, 1, 1] as int[]) == [1, 1, 1]
      subject.fix34([1] as int[]) == [1]
      subject.fix34([] as int[]) == []
      subject.fix34([7, 3, 7, 7, 4] as int[]) == [7, 3, 4, 7, 7]
      subject.fix34([3, 1, 4, 3, 1, 4] as int[]) == [3, 4, 1, 3, 4, 1]
      subject.fix34([3, 1, 1, 3, 4, 4] as int[]) == [3, 4, 1, 3, 4, 1]
  }
}

