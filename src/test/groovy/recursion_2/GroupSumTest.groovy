package recursion_2;

import spock.lang.Specification

class GroupSumTest extends Specification {
  def 'groupSum'() {
    setup:
      def subject = new GroupSum()
    expect:
      subject.groupSum(0, [2, 4, 8] as int[], 10) == true
      subject.groupSum(0, [2, 4, 8] as int[], 14) == true
      subject.groupSum(0, [2, 4, 8] as int[], 9) == false
      subject.groupSum(0, [2, 4, 8] as int[], 8) == true
      subject.groupSum(1, [2, 4, 8] as int[], 8) == true
      subject.groupSum(1, [2, 4, 8] as int[], 2) == false
      subject.groupSum(0, [1] as int[], 1) == true
      subject.groupSum(0, [9] as int[], 1) == false
      subject.groupSum(1, [9] as int[], 0) == true
      subject.groupSum(0, [] as int[], 0) == true
      subject.groupSum(0, [10, 2, 2, 5] as int[], 17) == true
      subject.groupSum(0, [10, 2, 2, 5] as int[], 15) == true
      subject.groupSum(0, [10, 2, 2, 5] as int[], 9) == true
  }
}

