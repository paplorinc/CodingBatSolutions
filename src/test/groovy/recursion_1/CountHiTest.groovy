package recursion_1;

import spock.lang.Specification

class CountHiTest extends Specification {
  def 'countHi'() {
    setup:
      def subject = new CountHi()
    expect:
      subject.countHi('xxhixx') == 1
      subject.countHi('xhixhix') == 2
      subject.countHi('hi') == 1
      subject.countHi('hihih') == 2
      subject.countHi('h') == 0
      subject.countHi('') == 0
      subject.countHi('ihihihihih') == 4
      subject.countHi('ihihihihihi') == 5
      subject.countHi('hiAAhi12hi') == 3
      subject.countHi('xhixhxihihhhih') == 3
      subject.countHi('ship') == 1
  }
}

