package recursion_1;

import spock.lang.Specification

class Count11Test extends Specification {
  def 'count11'() {
    setup:
      def subject = new Count11()
    expect:
      subject.count11('11abc11') == 2
      subject.count11('abc11x11x11') == 3
      subject.count11('111') == 1
      subject.count11('1111') == 2
      subject.count11('1') == 0
      subject.count11('') == 0
      subject.count11('hi') == 0
      subject.count11('11x111x1111') == 4
      subject.count11('1x111') == 1
      subject.count11('1Hello1') == 0
      subject.count11('Hello') == 0
  }
}

