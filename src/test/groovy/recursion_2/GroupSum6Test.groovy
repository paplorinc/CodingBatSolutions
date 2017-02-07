package recursion_2;

import spock.lang.Specification

class GroupSum6Test extends Specification {
  def 'groupSum6'() {
    setup:
      def subject = new GroupSum6()
    expect:
      subject.groupSum6(0, [5, 6, 2] as int[], 8) == true
      subject.groupSum6(0, [5, 6, 2] as int[], 9) == false
      subject.groupSum6(0, [5, 6, 2] as int[], 7) == false
      subject.groupSum6(0, [1] as int[], 1) == true
      subject.groupSum6(0, [9] as int[], 1) == false
      subject.groupSum6(0, [] as int[], 0) == true
      subject.groupSum6(0, [3, 2, 4, 6] as int[], 8) == true
      subject.groupSum6(0, [6, 2, 4, 3] as int[], 8) == true
      subject.groupSum6(0, [5, 2, 4, 6] as int[], 9) == false
      subject.groupSum6(0, [6, 2, 4, 5] as int[], 9) == false
      subject.groupSum6(0, [3, 2, 4, 6] as int[], 3) == false
      subject.groupSum6(0, [1, 6, 2, 6, 4] as int[], 12) == true
      subject.groupSum6(0, [1, 6, 2, 6, 4] as int[], 13) == true
      subject.groupSum6(0, [1, 6, 2, 6, 4] as int[], 4) == false
      subject.groupSum6(0, [1, 6, 2, 6, 4] as int[], 9) == false
      subject.groupSum6(0, [1, 6, 2, 6, 5] as int[], 14) == true
      subject.groupSum6(0, [1, 6, 2, 6, 5] as int[], 15) == true
      subject.groupSum6(0, [1, 6, 2, 6, 5] as int[], 16) == false
  }
}

