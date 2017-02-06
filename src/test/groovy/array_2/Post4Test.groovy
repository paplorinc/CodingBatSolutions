package array_2;

import spock.lang.Specification

class Post4Test extends Specification {
  def 'post4'() {
    setup:
      def subject = new Post4()
    expect:
      subject.post4([2, 4, 1, 2] as int[]) == [1, 2]
      subject.post4([4, 1, 4, 2] as int[]) == [2]
      subject.post4([4, 4, 1, 2, 3] as int[]) == [1, 2, 3]
      subject.post4([4, 2] as int[]) == [2]
      subject.post4([4, 4, 3] as int[]) == [3]
      subject.post4([4, 4] as int[]) == []
      subject.post4([4] as int[]) == []
      subject.post4([2, 4, 1, 4, 3, 2] as int[]) == [3, 2]
      subject.post4([4, 1, 4, 2, 2, 2] as int[]) == [2, 2, 2]
      subject.post4([3, 4, 3, 2] as int[]) == [3, 2]
  }
}

