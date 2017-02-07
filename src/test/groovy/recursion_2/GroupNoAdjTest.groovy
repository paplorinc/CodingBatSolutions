package recursion_2;

import spock.lang.Specification

class GroupNoAdjTest extends Specification {
  def 'groupNoAdj'() {
    setup:
      def subject = new GroupNoAdj()
    expect:
      subject.groupNoAdj(0, [2, 5, 10, 4] as int[], 12) == true
      subject.groupNoAdj(0, [2, 5, 10, 4] as int[], 14) == false
      subject.groupNoAdj(0, [2, 5, 10, 4] as int[], 7) == false
      subject.groupNoAdj(0, [2, 5, 10, 4, 2] as int[], 7) == true
      subject.groupNoAdj(0, [2, 5, 10, 4] as int[], 9) == true
      subject.groupNoAdj(0, [10, 2, 2, 3, 3] as int[], 15) == true
      subject.groupNoAdj(0, [10, 2, 2, 3, 3] as int[], 7) == false
      subject.groupNoAdj(0, [] as int[], 0) == true
      subject.groupNoAdj(0, [1] as int[], 1) == true
      subject.groupNoAdj(0, [9] as int[], 1) == false
      subject.groupNoAdj(0, [9] as int[], 0) == true
      subject.groupNoAdj(0, [5, 10, 4, 1] as int[], 11) == true
  }
}

