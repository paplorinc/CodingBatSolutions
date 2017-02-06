package array_2;

import spock.lang.Specification

class Only14Test extends Specification {
  def 'only14'() {
    setup:
      def subject = new Only14()
    expect:
      subject.only14([1, 4, 1, 4] as int[]) == true
      subject.only14([1, 4, 2, 4] as int[]) == false
      subject.only14([1, 1] as int[]) == true
      subject.only14([4, 1] as int[]) == true
      subject.only14([2] as int[]) == false
      subject.only14([] as int[]) == true
      subject.only14([1, 4, 1, 3] as int[]) == false
      subject.only14([3, 1, 3] as int[]) == false
      subject.only14([1] as int[]) == true
      subject.only14([4] as int[]) == true
      subject.only14([3, 4] as int[]) == false
      subject.only14([1, 3, 4] as int[]) == false
      subject.only14([1, 1, 1] as int[]) == true
      subject.only14([1, 1, 1, 5] as int[]) == false
      subject.only14([4, 1, 4, 1] as int[]) == true
  }
}

