package recursion_2;

import spock.lang.Specification

class SplitArrayTest extends Specification {
  def 'splitArray'() {
    setup:
      def subject = new SplitArray()
    expect:
      subject.splitArray([2, 2] as int[]) == true
      subject.splitArray([2, 3] as int[]) == false
      subject.splitArray([5, 2, 3] as int[]) == true
      subject.splitArray([5, 2, 2] as int[]) == false
      subject.splitArray([1, 1, 1, 1, 1, 1] as int[]) == true
      subject.splitArray([1, 1, 1, 1, 1] as int[]) == false
      subject.splitArray([] as int[]) == true
      subject.splitArray([1] as int[]) == false
      subject.splitArray([3, 5] as int[]) == false
      subject.splitArray([5, 3, 2] as int[]) == true
      subject.splitArray([2, 2, 10, 10, 1, 1] as int[]) == true
      subject.splitArray([1, 2, 2, 10, 10, 1, 1] as int[]) == false
      subject.splitArray([1, 2, 3, 10, 10, 1, 1] as int[]) == true
  }
}

