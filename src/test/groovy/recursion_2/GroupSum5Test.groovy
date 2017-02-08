package recursion_2;

import spock.lang.Specification

class GroupSum5Test extends Specification {
  def 'groupSum5'() {
    setup:
      def subject = new GroupSum5()
    expect:
      subject.groupSum5(0, [2, 5, 10, 4] as int[], 19) == true
      subject.groupSum5(0, [2, 5, 10, 4] as int[], 17) == true
      subject.groupSum5(0, [2, 5, 10, 4] as int[], 12) == false
      subject.groupSum5(0, [2, 5, 4, 10] as int[], 12) == false
      subject.groupSum5(0, [3, 5, 1] as int[], 4) == false
      subject.groupSum5(0, [3, 5, 1] as int[], 5) == true
      subject.groupSum5(0, [1, 3, 5] as int[], 5) == true
      subject.groupSum5(0, [3, 5, 1] as int[], 9) == false
      subject.groupSum5(0, [2, 5, 10, 4] as int[], 7) == false
      subject.groupSum5(0, [2, 5, 10, 4] as int[], 15) == true
      subject.groupSum5(0, [2, 5, 10, 4] as int[], 11) == false
      subject.groupSum5(0, [1] as int[], 1) == true
      subject.groupSum5(0, [9] as int[], 1) == false
      subject.groupSum5(0, [9] as int[], 0) == true
      subject.groupSum5(0, [] as int[], 0) == true
  }
}

