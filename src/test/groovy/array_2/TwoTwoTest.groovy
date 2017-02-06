package array_2;

import spock.lang.Specification

class TwoTwoTest extends Specification {
  def 'twoTwo'() {
    setup:
      def subject = new TwoTwo()
    expect:
      subject.twoTwo([4, 2, 2, 3] as int[]) == true
      subject.twoTwo([2, 2, 4] as int[]) == true
      subject.twoTwo([2, 2, 4, 2] as int[]) == false
      subject.twoTwo([1, 3, 4] as int[]) == true
      subject.twoTwo([1, 2, 2, 3, 4] as int[]) == true
      subject.twoTwo([1, 2, 3, 4] as int[]) == false
      subject.twoTwo([2, 2] as int[]) == true
      subject.twoTwo([2, 2, 7] as int[]) == true
      subject.twoTwo([2, 2, 7, 2, 1] as int[]) == false
      subject.twoTwo([4, 2, 2, 2] as int[]) == true
      subject.twoTwo([2, 2, 2] as int[]) == true
      subject.twoTwo([1, 2] as int[]) == false
      subject.twoTwo([2] as int[]) == false
      subject.twoTwo([1] as int[]) == true
      subject.twoTwo([] as int[]) == true
      subject.twoTwo([5, 2, 2, 3] as int[]) == true
      subject.twoTwo([2, 2, 5, 2] as int[]) == false
  }
}

