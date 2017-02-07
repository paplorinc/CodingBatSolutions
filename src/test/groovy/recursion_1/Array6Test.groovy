package recursion_1;

import spock.lang.Specification

class Array6Test extends Specification {
  def 'array6'() {
    setup:
      def subject = new Array6()
    expect:
      subject.array6([1, 6, 4] as int[], 0) == true
      subject.array6([1, 4] as int[], 0) == false
      subject.array6([6] as int[], 0) == true
      subject.array6([] as int[], 0) == false
      subject.array6([6, 2, 2] as int[], 0) == true
      subject.array6([2, 5] as int[], 0) == false
      subject.array6([1, 9, 4, 6, 6] as int[], 0) == true
      subject.array6([2, 5, 6] as int[], 0) == true
  }
}

