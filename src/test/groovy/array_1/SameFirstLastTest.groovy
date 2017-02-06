package array_1;

import spock.lang.Specification

class SameFirstLastTest extends Specification {
  def 'sameFirstLast'() {
    setup:
      def subject = new SameFirstLast()
    expect:
      subject.sameFirstLast([1, 2, 3] as int[]) == false
      subject.sameFirstLast([1, 2, 3, 1] as int[]) == true
      subject.sameFirstLast([1, 2, 1] as int[]) == true
      subject.sameFirstLast([7] as int[]) == true
      subject.sameFirstLast([] as int[]) == false
      subject.sameFirstLast([1, 2, 3, 4, 5, 1] as int[]) == true
      subject.sameFirstLast([1, 2, 3, 4, 5, 13] as int[]) == false
      subject.sameFirstLast([13, 2, 3, 4, 5, 13] as int[]) == true
      subject.sameFirstLast([7, 7] as int[]) == true
  }
}

