package array_2;

import spock.lang.Specification

class Sum67Test extends Specification {
  def 'sum67'() {
    setup:
      def subject = new Sum67()
    expect:
      subject.sum67([1, 2, 2] as int[]) == 5
      subject.sum67([1, 2, 2, 6, 99, 99, 7] as int[]) == 5
      subject.sum67([1, 1, 6, 7, 2] as int[]) == 4
      subject.sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7] as int[]) == 2
      subject.sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7] as int[]) == 2
      subject.sum67([2, 7, 6, 2, 6, 7, 2, 7] as int[]) == 18
      subject.sum67([2, 7, 6, 2, 6, 2, 7] as int[]) == 9
      subject.sum67([1, 6, 7, 7] as int[]) == 8
      subject.sum67([6, 7, 1, 6, 7, 7] as int[]) == 8
      subject.sum67([6, 8, 1, 6, 7] as int[]) == 0
      subject.sum67([] as int[]) == 0
      subject.sum67([6, 7, 11] as int[]) == 11
      subject.sum67([11, 6, 7, 11] as int[]) == 22
      subject.sum67([2, 2, 6, 7, 7] as int[]) == 11
  }
}

