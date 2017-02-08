package recursion_2;

import spock.lang.Specification

class SplitOdd10Test extends Specification {
  def 'splitOdd10'() {
    setup:
      def subject = new SplitOdd10()
    expect:
      subject.splitOdd10([5, 5, 5] as int[]) == true
      subject.splitOdd10([5, 5, 6] as int[]) == false
      subject.splitOdd10([5, 5, 6, 1] as int[]) == true
      subject.splitOdd10([6, 5, 5, 1] as int[]) == true
      subject.splitOdd10([6, 5, 5, 1, 10] as int[]) == true
      subject.splitOdd10([6, 5, 5, 5, 1] as int[]) == false
      subject.splitOdd10([1] as int[]) == true
      subject.splitOdd10([] as int[]) == false
      subject.splitOdd10([10, 7, 5, 5] as int[]) == true
      subject.splitOdd10([10, 0, 5, 5] as int[]) == false
      subject.splitOdd10([10, 7, 5, 5, 2] as int[]) == true
      subject.splitOdd10([10, 7, 5, 5, 1] as int[]) == false
  }
}

