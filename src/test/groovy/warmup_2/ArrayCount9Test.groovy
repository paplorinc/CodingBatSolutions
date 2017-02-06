package warmup_2;

import spock.lang.Specification

class ArrayCount9Test extends Specification {
  def 'arrayCount9'() {
    setup:
      def subject = new ArrayCount9()
    expect:
      subject.arrayCount9([1, 2, 9] as int[]) == 1
      subject.arrayCount9([1, 9, 9] as int[]) == 2
      subject.arrayCount9([1, 9, 9, 3, 9] as int[]) == 3
      subject.arrayCount9([1, 2, 3] as int[]) == 0
      subject.arrayCount9([] as int[]) == 0
      subject.arrayCount9([4, 2, 4, 3, 1] as int[]) == 0
      subject.arrayCount9([9, 2, 4, 3, 1] as int[]) == 1
  }
}

