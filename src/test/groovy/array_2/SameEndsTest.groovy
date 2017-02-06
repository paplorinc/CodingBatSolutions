package array_2;

import spock.lang.Specification

class SameEndsTest extends Specification {
  def 'sameEnds'() {
    setup:
      def subject = new SameEnds()
    expect:
      subject.sameEnds([5, 6, 45, 99, 13, 5, 6] as int[], 1) == false
      subject.sameEnds([5, 6, 45, 99, 13, 5, 6] as int[], 2) == true
      subject.sameEnds([5, 6, 45, 99, 13, 5, 6] as int[], 3) == false
      subject.sameEnds([1, 2, 5, 2, 1] as int[], 1) == true
      subject.sameEnds([1, 2, 5, 2, 1] as int[], 2) == false
      subject.sameEnds([1, 2, 5, 2, 1] as int[], 0) == true
      subject.sameEnds([1, 2, 5, 2, 1] as int[], 5) == true
      subject.sameEnds([1, 1, 1] as int[], 0) == true
      subject.sameEnds([1, 1, 1] as int[], 1) == true
      subject.sameEnds([1, 1, 1] as int[], 2) == true
      subject.sameEnds([1, 1, 1] as int[], 3) == true
      subject.sameEnds([1] as int[], 1) == true
      subject.sameEnds([] as int[], 0) == true
      subject.sameEnds([4, 2, 4, 5] as int[], 1) == false
  }
}

