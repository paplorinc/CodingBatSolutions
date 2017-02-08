package recursion_2;

import spock.lang.Specification

class GroupSumClumpTest extends Specification {
  def 'groupSumClump'() {
    setup:
      def subject = new GroupSumClump()
    expect:
      subject.groupSumClump(0, [2, 4, 8] as int[], 10) == true
      subject.groupSumClump(0, [1, 2, 4, 8, 1] as int[], 14) == true
      subject.groupSumClump(0, [2, 4, 4, 8] as int[], 14) == false
      subject.groupSumClump(0, [8, 2, 2, 1] as int[], 9) == true
      subject.groupSumClump(0, [8, 2, 2, 1] as int[], 11) == false
      subject.groupSumClump(0, [1] as int[], 1) == true
      subject.groupSumClump(0, [9] as int[], 1) == false
  }
}

