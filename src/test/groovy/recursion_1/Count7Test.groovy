package recursion_1;

import spock.lang.Specification

class Count7Test extends Specification {
  def 'count7'() {
    setup:
      def subject = new Count7()
    expect:
      subject.count7(717) == 2
      subject.count7(7) == 1
      subject.count7(123) == 0
      subject.count7(77) == 2
      subject.count7(7123) == 1
      subject.count7(771237) == 3
      subject.count7(771737) == 4
      subject.count7(47571) == 2
      subject.count7(777777) == 6
      subject.count7(70701277) == 4
      subject.count7(777576197) == 5
      subject.count7(99999) == 0
      subject.count7(99799) == 1
  }
}

