package recursion_1;

import spock.lang.Specification

class CountXTest extends Specification {
  def 'countX'() {
    setup:
      def subject = new CountX()
    expect:
      subject.countX('xxhixx') == 4
      subject.countX('xhixhix') == 3
      subject.countX('hi') == 0
      subject.countX('h') == 0
      subject.countX('x') == 1
      subject.countX('') == 0
      subject.countX('hihi') == 0
      subject.countX('hiAAhi12hi') == 0
  }
}

