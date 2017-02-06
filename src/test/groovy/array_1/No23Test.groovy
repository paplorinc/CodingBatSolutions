package array_1;

import spock.lang.Specification

class No23Test extends Specification {
  def 'no23'() {
    setup:
      def subject = new No23()
    expect:
      subject.no23([4, 5] as int[]) == true
      subject.no23([4, 2] as int[]) == false
      subject.no23([3, 5] as int[]) == false
      subject.no23([1, 9] as int[]) == true
      subject.no23([2, 9] as int[]) == false
      subject.no23([1, 3] as int[]) == false
      subject.no23([1, 1] as int[]) == true
      subject.no23([2, 2] as int[]) == false
      subject.no23([3, 3] as int[]) == false
      subject.no23([7, 8] as int[]) == true
      subject.no23([8, 7] as int[]) == true
  }
}

