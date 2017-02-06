package warmup_2;

import spock.lang.Specification

class Array667Test extends Specification {
  def 'array667'() {
    setup:
      def subject = new Array667()
    expect:
      subject.array667([6, 6, 2] as int[]) == 1
      subject.array667([6, 6, 2, 6] as int[]) == 1
      subject.array667([6, 7, 2, 6] as int[]) == 1
      subject.array667([6, 6, 2, 6, 7] as int[]) == 2
      subject.array667([1, 6, 3] as int[]) == 0
      subject.array667([6, 1] as int[]) == 0
      subject.array667([] as int[]) == 0
      subject.array667([3, 6, 7, 6] as int[]) == 1
      subject.array667([3, 6, 6, 7] as int[]) == 2
      subject.array667([6, 3, 6, 6] as int[]) == 1
      subject.array667([6, 7, 6, 6] as int[]) == 2
      subject.array667([1, 2, 3, 5, 6] as int[]) == 0
      subject.array667([1, 2, 3, 6, 6] as int[]) == 1
  }
}

