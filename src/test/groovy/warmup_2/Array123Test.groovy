package warmup_2;

import spock.lang.Specification

class Array123Test extends Specification {
  def 'array123'() {
    setup:
      def subject = new Array123()
    expect:
      subject.array123([1, 1, 2, 3, 1] as int[]) == true
      subject.array123([1, 1, 2, 4, 1] as int[]) == false
      subject.array123([1, 1, 2, 1, 2, 3] as int[]) == true
      subject.array123([1, 1, 2, 1, 2, 1] as int[]) == false
      subject.array123([1, 2, 3, 1, 2, 3] as int[]) == true
      subject.array123([1, 2, 3] as int[]) == true
      subject.array123([1, 1, 1] as int[]) == false
      subject.array123([1, 2] as int[]) == false
      subject.array123([1] as int[]) == false
      subject.array123([] as int[]) == false
  }
}

