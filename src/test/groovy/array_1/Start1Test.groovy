package array_1;

import spock.lang.Specification

class Start1Test extends Specification {
  def 'start1'() {
    setup:
      def subject = new Start1()
    expect:
      subject.start1([1, 2, 3] as int[], [1, 3] as int[]) == 2
      subject.start1([7, 2, 3] as int[], [1] as int[]) == 1
      subject.start1([1, 2] as int[], [] as int[]) == 1
      subject.start1([] as int[], [1, 2] as int[]) == 1
      subject.start1([7] as int[], [] as int[]) == 0
      subject.start1([7] as int[], [1] as int[]) == 1
      subject.start1([1] as int[], [1] as int[]) == 2
      subject.start1([7] as int[], [8] as int[]) == 0
      subject.start1([] as int[], [] as int[]) == 0
      subject.start1([1, 3] as int[], [1] as int[]) == 2
  }
}

