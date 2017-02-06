package array_2;

import spock.lang.Specification

class WithoutTenTest extends Specification {
  def 'withoutTen'() {
    setup:
      def subject = new WithoutTen()
    expect:
      subject.withoutTen([1, 10, 10, 2] as int[]) == [1, 2, 0, 0]
      subject.withoutTen([10, 2, 10] as int[]) == [2, 0, 0]
      subject.withoutTen([1, 99, 10] as int[]) == [1, 99, 0]
      subject.withoutTen([10, 13, 10, 14] as int[]) == [13, 14, 0, 0]
      subject.withoutTen([10, 13, 10, 14, 10] as int[]) == [13, 14, 0, 0, 0]
      subject.withoutTen([10, 10, 3] as int[]) == [3, 0, 0]
      subject.withoutTen([1] as int[]) == [1]
      subject.withoutTen([13, 1] as int[]) == [13, 1]
      subject.withoutTen([10] as int[]) == [0]
      subject.withoutTen([] as int[]) == []
  }
}

