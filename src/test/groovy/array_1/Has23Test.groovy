package array_1;

import spock.lang.Specification

class Has23Test extends Specification {
  def 'has23'() {
    setup:
      def subject = new Has23()
    expect:
      subject.has23([2, 5] as int[]) == true
      subject.has23([4, 3] as int[]) == true
      subject.has23([4, 5] as int[]) == false
      subject.has23([2, 2] as int[]) == true
      subject.has23([3, 2] as int[]) == true
      subject.has23([3, 3] as int[]) == true
      subject.has23([7, 7] as int[]) == false
      subject.has23([3, 9] as int[]) == true
      subject.has23([9, 5] as int[]) == false
  }
}

