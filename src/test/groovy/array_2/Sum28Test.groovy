package array_2;

import spock.lang.Specification

class Sum28Test extends Specification {
  def 'sum28'() {
    setup:
      def subject = new Sum28()
    expect:
      subject.sum28([2, 3, 2, 2, 4, 2] as int[]) == true
      subject.sum28([2, 3, 2, 2, 4, 2, 2] as int[]) == false
      subject.sum28([1, 2, 3, 4] as int[]) == false
      subject.sum28([2, 2, 2, 2] as int[]) == true
      subject.sum28([1, 2, 2, 2, 2, 4] as int[]) == true
      subject.sum28([] as int[]) == false
      subject.sum28([2] as int[]) == false
      subject.sum28([8] as int[]) == false
      subject.sum28([2, 2, 2] as int[]) == false
      subject.sum28([2, 2, 2, 2, 2] as int[]) == false
      subject.sum28([1, 2, 2, 1, 2, 2] as int[]) == true
      subject.sum28([5, 2, 2, 2, 4, 2] as int[]) == true
  }
}

