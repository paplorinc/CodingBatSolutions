package array_2;

import spock.lang.Specification

class TripleUpTest extends Specification {
  def 'tripleUp'() {
    setup:
      def subject = new TripleUp()
    expect:
      subject.tripleUp([1, 4, 5, 6, 2] as int[]) == true
      subject.tripleUp([1, 2, 3] as int[]) == true
      subject.tripleUp([1, 2, 4] as int[]) == false
      subject.tripleUp([1, 2, 4, 5, 7, 6, 5, 6, 7, 6] as int[]) == true
      subject.tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6] as int[]) == false
      subject.tripleUp([1, 2] as int[]) == false
      subject.tripleUp([1] as int[]) == false
      subject.tripleUp([] as int[]) == false
      subject.tripleUp([10, 9, 8, -100, -99, -98, 100] as int[]) == true
      subject.tripleUp([10, 9, 8, -100, -99, 99, 100] as int[]) == false
      subject.tripleUp([-100, -99, -99, 100, 101, 102] as int[]) == true
      subject.tripleUp([2, 3, 5, 6, 8, 9, 2, 3] as int[]) == false
  }
}

