package array_2;

import spock.lang.Specification

class Sum13Test extends Specification {
  def 'sum13'() {
    setup:
      def subject = new Sum13()
    expect:
      subject.sum13([1, 2, 2, 1] as int[]) == 6
      subject.sum13([1, 1] as int[]) == 2
      subject.sum13([1, 2, 2, 1, 13] as int[]) == 6
      subject.sum13([1, 2, 13, 2, 1, 13] as int[]) == 4
      subject.sum13([13, 1, 2, 13, 2, 1, 13] as int[]) == 3
      subject.sum13([] as int[]) == 0
      subject.sum13([13] as int[]) == 0
      subject.sum13([13, 13] as int[]) == 0
      subject.sum13([13, 0, 13] as int[]) == 0
      subject.sum13([13, 1, 13] as int[]) == 0
      subject.sum13([5, 7, 2] as int[]) == 14
      subject.sum13([5, 13, 2] as int[]) == 5
      subject.sum13([0] as int[]) == 0
      subject.sum13([13, 0] as int[]) == 0
  }
}

