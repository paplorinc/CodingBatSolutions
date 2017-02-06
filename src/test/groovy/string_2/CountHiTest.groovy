package string_2;

import spock.lang.Specification

class CountHiTest extends Specification {
  def 'countHi'() {
    setup:
      def subject = new CountHi()
    expect:
      subject.countHi('abc hi ho') == 1
      subject.countHi('ABChi hi') == 2
      subject.countHi('hihi') == 2
      subject.countHi('hiHIhi') == 2
      subject.countHi('') == 0
      subject.countHi('h') == 0
      subject.countHi('hi') == 1
      subject.countHi('Hi is no HI on ahI') == 0
      subject.countHi('hiho not HOHIhi') == 2
  }
}

