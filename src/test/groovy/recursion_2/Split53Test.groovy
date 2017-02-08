package recursion_2;

import spock.lang.Specification

class Split53Test extends Specification {
  def 'split53'() {
    setup:
      def subject = new Split53()
    expect:
      subject.split53([1, 1] as int[]) == true
      subject.split53([1, 1, 1] as int[]) == false
      subject.split53([2, 4, 2] as int[]) == true
      subject.split53([2, 2, 2, 1] as int[]) == false
      subject.split53([3, 3, 5, 1] as int[]) == true
      subject.split53([3, 5, 8] as int[]) == false
      subject.split53([2, 4, 6] as int[]) == true
      subject.split53([3, 5, 6, 10, 3, 3] as int[]) == true
  }
}

