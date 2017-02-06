package array_1;

import spock.lang.Specification

class Double23Test extends Specification {
  def 'double23'() {
    setup:
      def subject = new Double23()
    expect:
      subject.double23([2, 2] as int[]) == true
      subject.double23([3, 3] as int[]) == true
      subject.double23([2, 3] as int[]) == false
      subject.double23([3, 2] as int[]) == false
      subject.double23([4, 5] as int[]) == false
      subject.double23([2] as int[]) == false
      subject.double23([3] as int[]) == false
      subject.double23([] as int[]) == false
      subject.double23([3, 4] as int[]) == false
  }
}

