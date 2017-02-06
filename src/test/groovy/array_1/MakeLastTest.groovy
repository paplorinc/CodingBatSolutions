package array_1;

import spock.lang.Specification

class MakeLastTest extends Specification {
  def 'makeLast'() {
    setup:
      def subject = new MakeLast()
    expect:
      subject.makeLast([4, 5, 6] as int[]) == [0, 0, 0, 0, 0, 6]
      subject.makeLast([1, 2] as int[]) == [0, 0, 0, 2]
      subject.makeLast([3] as int[]) == [0, 3]
      subject.makeLast([0] as int[]) == [0, 0]
      subject.makeLast([7, 7, 7] as int[]) == [0, 0, 0, 0, 0, 7]
      subject.makeLast([3, 1, 4] as int[]) == [0, 0, 0, 0, 0, 4]
      subject.makeLast([1, 2, 3, 4] as int[]) == [0, 0, 0, 0, 0, 0, 0, 4]
      subject.makeLast([1, 2, 3, 0] as int[]) == [0, 0, 0, 0, 0, 0, 0, 0]
      subject.makeLast([2, 4] as int[]) == [0, 0, 0, 4]
  }
}

