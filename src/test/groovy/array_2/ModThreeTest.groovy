package array_2;

import spock.lang.Specification

class ModThreeTest extends Specification {
  def 'modThree'() {
    setup:
      def subject = new ModThree()
    expect:
      subject.modThree([2, 1, 3, 5] as int[]) == true
      subject.modThree([2, 1, 2, 5] as int[]) == false
      subject.modThree([2, 4, 2, 5] as int[]) == true
      subject.modThree([1, 2, 1, 2, 1] as int[]) == false
      subject.modThree([9, 9, 9] as int[]) == true
      subject.modThree([1, 2, 1] as int[]) == false
      subject.modThree([1, 2] as int[]) == false
      subject.modThree([1] as int[]) == false
      subject.modThree([] as int[]) == false
      subject.modThree([9, 7, 2, 9] as int[]) == false
      subject.modThree([9, 7, 2, 9, 2, 2] as int[]) == false
      subject.modThree([9, 7, 2, 9, 2, 2, 6] as int[]) == true
  }
}

