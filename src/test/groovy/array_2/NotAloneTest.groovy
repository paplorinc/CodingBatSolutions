package array_2;

import spock.lang.Specification

class NotAloneTest extends Specification {
  def 'notAlone'() {
    setup:
      def subject = new NotAlone()
    expect:
      subject.notAlone([1, 2, 3] as int[], 2) == [1, 3, 3]
      subject.notAlone([1, 2, 3, 2, 5, 2] as int[], 2) == [1, 3, 3, 5, 5, 2]
      subject.notAlone([3, 4] as int[], 3) == [3, 4]
      subject.notAlone([3, 3] as int[], 3) == [3, 3]
      subject.notAlone([1, 3, 1, 2] as int[], 1) == [1, 3, 3, 2]
      subject.notAlone([3] as int[], 3) == [3]
      subject.notAlone([] as int[], 3) == []
      subject.notAlone([7, 1, 6] as int[], 1) == [7, 7, 6]
      subject.notAlone([1, 1, 1] as int[], 1) == [1, 1, 1]
      subject.notAlone([1, 1, 1, 2] as int[], 1) == [1, 1, 1, 2]
  }
}

