package array_2;

import spock.lang.Specification

class CountEvensTest extends Specification {
  def 'countEvens'() {
    setup:
      def subject = new CountEvens()
    expect:
      subject.countEvens([2, 1, 2, 3, 4] as int[]) == 3
      subject.countEvens([2, 2, 0] as int[]) == 3
      subject.countEvens([1, 3, 5] as int[]) == 0
      subject.countEvens([] as int[]) == 0
      subject.countEvens([11, 9, 0, 1] as int[]) == 1
      subject.countEvens([2, 11, 9, 0] as int[]) == 2
      subject.countEvens([2] as int[]) == 1
      subject.countEvens([2, 5, 12] as int[]) == 2
  }
}

