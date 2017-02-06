package array_3;

import spock.lang.Specification

class Fix45Test extends Specification {
  def 'fix45'() {
    setup:
      def subject = new Fix45()
    expect:
      subject.fix45([5, 4, 9, 4, 9, 5] as int[]) == [9, 4, 5, 4, 5, 9]
      subject.fix45([1, 4, 1, 5] as int[]) == [1, 4, 5, 1]
      subject.fix45([1, 4, 1, 5, 5, 4, 1] as int[]) == [1, 4, 5, 1, 1, 4, 5]
      subject.fix45([4, 9, 4, 9, 5, 5, 4, 9, 5] as int[]) == [4, 5, 4, 5, 9, 9, 4, 5, 9]
      subject.fix45([5, 5, 4, 1, 4, 1] as int[]) == [1, 1, 4, 5, 4, 5]
      subject.fix45([4, 2, 2, 5] as int[]) == [4, 5, 2, 2]
      subject.fix45([4, 2, 4, 2, 5, 5] as int[]) == [4, 5, 4, 5, 2, 2]
      subject.fix45([4, 2, 4, 5, 5] as int[]) == [4, 5, 4, 5, 2]
      subject.fix45([1, 1, 1] as int[]) == [1, 1, 1]
      subject.fix45([4, 5] as int[]) == [4, 5]
      subject.fix45([5, 4, 1] as int[]) == [1, 4, 5]
      subject.fix45([] as int[]) == []
      subject.fix45([5, 4, 5, 4, 1] as int[]) == [1, 4, 5, 4, 5]
      subject.fix45([4, 5, 4, 1, 5] as int[]) == [4, 5, 4, 5, 1]
      subject.fix45([3, 4, 5] as int[]) == [3, 4, 5]
      subject.fix45([4, 1, 5] as int[]) == [4, 5, 1]
      subject.fix45([5, 4, 1] as int[]) == [1, 4, 5]
      subject.fix45([2, 4, 2, 5] as int[]) == [2, 4, 5, 2]
  }
}

