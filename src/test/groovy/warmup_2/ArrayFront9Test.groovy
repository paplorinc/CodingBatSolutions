package warmup_2;

import spock.lang.Specification

class ArrayFront9Test extends Specification {
  def 'arrayFront9'() {
    setup:
      def subject = new ArrayFront9()
    expect:
      subject.arrayFront9([1, 2, 9, 3, 4] as int[]) == true
      subject.arrayFront9([1, 2, 3, 4, 9] as int[]) == false
      subject.arrayFront9([1, 2, 3, 4, 5] as int[]) == false
      subject.arrayFront9([9, 2, 3] as int[]) == true
      subject.arrayFront9([1, 9, 9] as int[]) == true
      subject.arrayFront9([1, 2, 3] as int[]) == false
      subject.arrayFront9([1, 9] as int[]) == true
      subject.arrayFront9([5, 5] as int[]) == false
      subject.arrayFront9([2] as int[]) == false
      subject.arrayFront9([9] as int[]) == true
      subject.arrayFront9([] as int[]) == false
      subject.arrayFront9([3, 9, 2, 3, 3] as int[]) == true
  }
}

