package array_3;

import spock.lang.Specification

class CanBalanceTest extends Specification {
  def 'canBalance'() {
    setup:
      def subject = new CanBalance()
    expect:
      subject.canBalance([1, 1, 1, 2, 1] as int[]) == true
      subject.canBalance([2, 1, 1, 2, 1] as int[]) == false
      subject.canBalance([10, 10] as int[]) == true
      subject.canBalance([10, 0, 1, -1, 10] as int[]) == true
      subject.canBalance([1, 1, 1, 1, 4] as int[]) == true
      subject.canBalance([2, 1, 1, 1, 4] as int[]) == false
      subject.canBalance([2, 3, 4, 1, 2] as int[]) == false
      subject.canBalance([1, 2, 3, 1, 0, 2, 3] as int[]) == true
      subject.canBalance([1, 2, 3, 1, 0, 1, 3] as int[]) == false
      subject.canBalance([1] as int[]) == false
      subject.canBalance([1, 1, 1, 2, 1] as int[]) == true
  }
}

