package array_2;

import spock.lang.Specification

class IsEverywhereTest extends Specification {
  def 'isEverywhere'() {
    setup:
      def subject = new IsEverywhere()
    expect:
      subject.isEverywhere([1, 2, 1, 3] as int[], 1) == true
      subject.isEverywhere([1, 2, 1, 3] as int[], 2) == false
      subject.isEverywhere([1, 2, 1, 3, 4] as int[], 1) == false
      subject.isEverywhere([2, 1, 2, 1] as int[], 1) == true
      subject.isEverywhere([2, 1, 2, 1] as int[], 2) == true
      subject.isEverywhere([2, 1, 2, 3, 1] as int[], 2) == false
      subject.isEverywhere([3, 1] as int[], 3) == true
      subject.isEverywhere([3, 1] as int[], 2) == false
      subject.isEverywhere([3] as int[], 1) == true
      subject.isEverywhere([] as int[], 1) == true
      subject.isEverywhere([1, 2, 1, 2, 3, 2, 5] as int[], 2) == true
      subject.isEverywhere([1, 2, 1, 1, 1, 2] as int[], 2) == false
      subject.isEverywhere([2, 1, 2, 1, 1, 2] as int[], 2) == false
      subject.isEverywhere([2, 1, 2, 2, 2, 1, 1, 2] as int[], 2) == false
      subject.isEverywhere([2, 1, 2, 2, 2, 1, 2, 1] as int[], 2) == true
      subject.isEverywhere([2, 1, 2, 1, 2] as int[], 2) == true
  }
}

