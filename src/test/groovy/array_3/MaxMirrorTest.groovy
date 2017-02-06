package array_3;

import spock.lang.Specification

class MaxMirrorTest extends Specification {
  def 'maxMirror'() {
    setup:
      def subject = new MaxMirror()
    expect:
      subject.maxMirror([1, 2, 3, 8, 9, 3, 2, 1] as int[]) == 3
      subject.maxMirror([1, 2, 1, 4] as int[]) == 3
      subject.maxMirror([7, 1, 2, 9, 7, 2, 1] as int[]) == 2
      subject.maxMirror([21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9] as int[]) == 4
      subject.maxMirror([1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25] as int[]) == 4
      subject.maxMirror([1, 2, 3, 2, 1] as int[]) == 5
      subject.maxMirror([1, 2, 3, 3, 8] as int[]) == 2
      subject.maxMirror([1, 2, 7, 8, 1, 7, 2] as int[]) == 2
      subject.maxMirror([1, 1, 1] as int[]) == 3
      subject.maxMirror([1] as int[]) == 1
      subject.maxMirror([] as int[]) == 0
      subject.maxMirror([9, 1, 1, 4, 2, 1, 1, 1] as int[]) == 3
      subject.maxMirror([5, 9, 9, 4, 5, 4, 9, 9, 2] as int[]) == 7
      subject.maxMirror([5, 9, 9, 6, 5, 4, 9, 9, 2] as int[]) == 2
      subject.maxMirror([5, 9, 1, 6, 5, 4, 1, 9, 5] as int[]) == 3
  }
}

