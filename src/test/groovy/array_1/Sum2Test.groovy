package array_1;

import spock.lang.Specification

class Sum2Test extends Specification {
  def 'sum2'() {
    setup:
      def subject = new Sum2()
    expect:
      subject.sum2([1, 2, 3] as int[]) == 3
      subject.sum2([1, 1] as int[]) == 2
      subject.sum2([1, 1, 1, 1] as int[]) == 2
      subject.sum2([1, 2] as int[]) == 3
      subject.sum2([1] as int[]) == 1
      subject.sum2([] as int[]) == 0
      subject.sum2([4, 5, 6] as int[]) == 9
      subject.sum2([4] as int[]) == 4
  }
}

