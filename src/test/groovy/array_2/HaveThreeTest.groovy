package array_2;

import spock.lang.Specification

class HaveThreeTest extends Specification {
  def 'haveThree'() {
    setup:
      def subject = new HaveThree()
    expect:
      subject.haveThree([3, 1, 3, 1, 3] as int[]) == true
      subject.haveThree([3, 1, 3, 3] as int[]) == false
      subject.haveThree([3, 4, 3, 3, 4] as int[]) == false
      subject.haveThree([1, 3, 1, 3, 1, 2] as int[]) == false
      subject.haveThree([1, 3, 1, 3, 1, 3] as int[]) == true
      subject.haveThree([1, 3, 3, 1, 3] as int[]) == false
      subject.haveThree([1, 3, 1, 3, 1, 3, 4, 3] as int[]) == false
      subject.haveThree([3, 4, 3, 4, 3, 4, 4] as int[]) == true
      subject.haveThree([3, 3, 3] as int[]) == false
      subject.haveThree([1, 3] as int[]) == false
      subject.haveThree([3] as int[]) == false
      subject.haveThree([1] as int[]) == false
  }
}

