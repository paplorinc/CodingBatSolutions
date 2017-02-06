package array_2;

import spock.lang.Specification

class No14Test extends Specification {
  def 'no14'() {
    setup:
      def subject = new No14()
    expect:
      subject.no14([1, 2, 3] as int[]) == true
      subject.no14([1, 2, 3, 4] as int[]) == false
      subject.no14([2, 3, 4] as int[]) == true
      subject.no14([1, 1, 4, 4] as int[]) == false
      subject.no14([2, 2, 4, 4] as int[]) == true
      subject.no14([2, 3, 4, 1] as int[]) == false
      subject.no14([2, 1, 1] as int[]) == true
      subject.no14([1, 4] as int[]) == false
      subject.no14([2] as int[]) == true
      subject.no14([2, 1] as int[]) == true
      subject.no14([1] as int[]) == true
      subject.no14([4] as int[]) == true
      subject.no14([] as int[]) == true
      subject.no14([1, 1, 1, 1] as int[]) == true
      subject.no14([9, 4, 4, 1] as int[]) == false
      subject.no14([4, 2, 3, 1] as int[]) == false
      subject.no14([4, 2, 3, 5] as int[]) == true
      subject.no14([4, 4, 2] as int[]) == true
      subject.no14([1, 4, 4] as int[]) == false
  }
}

