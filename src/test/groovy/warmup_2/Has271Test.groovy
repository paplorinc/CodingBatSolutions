package warmup_2;

import spock.lang.Specification

class Has271Test extends Specification {
  def 'has271'() {
    setup:
      def subject = new Has271()
    expect:
      subject.has271([1, 2, 7, 1] as int[]) == true
      subject.has271([1, 2, 8, 1] as int[]) == false
      subject.has271([2, 7, 1] as int[]) == true
      subject.has271([3, 8, 2] as int[]) == true
      subject.has271([2, 7, 3] as int[]) == true
      subject.has271([2, 7, 4] as int[]) == false
      subject.has271([2, 7, -1] as int[]) == true
      subject.has271([2, 7, -2] as int[]) == false
      subject.has271([4, 5, 3, 8, 0] as int[]) == true
      subject.has271([2, 7, 5, 10, 4] as int[]) == true
      subject.has271([2, 7, -2, 4, 9, 3] as int[]) == true
      subject.has271([2, 7, 5, 10, 1] as int[]) == false
      subject.has271([2, 7, -2, 4, 10, 2] as int[]) == false
  }
}

