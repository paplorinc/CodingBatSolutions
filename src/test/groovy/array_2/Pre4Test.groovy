package array_2;

import spock.lang.Specification

class Pre4Test extends Specification {
  def 'pre4'() {
    setup:
      def subject = new Pre4()
    expect:
      subject.pre4([1, 2, 4, 1] as int[]) == [1, 2]
      subject.pre4([3, 1, 4] as int[]) == [3, 1]
      subject.pre4([1, 4, 4] as int[]) == [1]
      subject.pre4([1, 4, 4, 2] as int[]) == [1]
      subject.pre4([1, 3, 4, 2, 4] as int[]) == [1, 3]
      subject.pre4([4, 4] as int[]) == []
      subject.pre4([3, 3, 4] as int[]) == [3, 3]
      subject.pre4([1, 2, 1, 4] as int[]) == [1, 2, 1]
      subject.pre4([2, 1, 4, 2] as int[]) == [2, 1]
      subject.pre4([2, 1, 2, 1, 4, 2] as int[]) == [2, 1, 2, 1]
  }
}

