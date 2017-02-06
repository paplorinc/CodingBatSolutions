package array_1;

import spock.lang.Specification

class FirstLast6Test extends Specification {
  def 'firstLast6'() {
    setup:
      def subject = new FirstLast6()
    expect:
      subject.firstLast6([1, 2, 6] as int[]) == true
      subject.firstLast6([6, 1, 2, 3] as int[]) == true
      subject.firstLast6([13, 6, 1, 2, 3] as int[]) == false
      subject.firstLast6([13, 6, 1, 2, 6] as int[]) == true
      subject.firstLast6([3, 2, 1] as int[]) == false
      subject.firstLast6([3, 6, 1] as int[]) == false
      subject.firstLast6([3, 6] as int[]) == true
      subject.firstLast6([6] as int[]) == true
      subject.firstLast6([3] as int[]) == false
      subject.firstLast6([5, 6] as int[]) == true
      subject.firstLast6([5, 5] as int[]) == false
      subject.firstLast6([1, 2, 3, 4, 6] as int[]) == true
      subject.firstLast6([1, 2, 3, 4] as int[]) == false
  }
}

