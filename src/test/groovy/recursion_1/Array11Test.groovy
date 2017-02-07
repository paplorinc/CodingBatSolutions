package recursion_1;

import spock.lang.Specification

class Array11Test extends Specification {
  def 'array11'() {
    setup:
      def subject = new Array11()
    expect:
      subject.array11([1, 2, 11] as int[], 0) == 1
      subject.array11([11, 11] as int[], 0) == 2
      subject.array11([1, 2, 3, 4] as int[], 0) == 0
      subject.array11([1, 11, 3, 11, 11] as int[], 0) == 3
      subject.array11([11] as int[], 0) == 1
      subject.array11([1] as int[], 0) == 0
      subject.array11([] as int[], 0) == 0
      subject.array11([11, 2, 3, 4, 11, 5] as int[], 0) == 2
      subject.array11([11, 5, 11] as int[], 0) == 2
  }
}

