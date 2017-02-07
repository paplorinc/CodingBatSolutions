package recursion_1;

import spock.lang.Specification

class Array220Test extends Specification {
  def 'array220'() {
    setup:
      def subject = new Array220()
    expect:
      subject.array220([1, 2, 20] as int[], 0) == true
      subject.array220([3, 30] as int[], 0) == true
      subject.array220([3] as int[], 0) == false
      subject.array220([] as int[], 0) == false
      subject.array220([3, 3, 30, 4] as int[], 0) == true
      subject.array220([2, 19, 4] as int[], 0) == false
      subject.array220([20, 2, 21] as int[], 0) == false
      subject.array220([20, 2, 21, 210] as int[], 0) == true
      subject.array220([2, 200, 2000] as int[], 0) == true
      subject.array220([0, 0] as int[], 0) == true
      subject.array220([1, 2, 3, 4, 5, 6] as int[], 0) == false
      subject.array220([1, 2, 3, 4, 5, 50, 6] as int[], 0) == true
      subject.array220([1, 2, 3, 4, 5, 51, 6] as int[], 0) == false
      subject.array220([1, 2, 3, 4, 4, 50, 500, 6] as int[], 0) == true
  }
}

