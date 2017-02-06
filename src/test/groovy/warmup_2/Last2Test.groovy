package warmup_2;

import spock.lang.Specification

class Last2Test extends Specification {
  def 'last2'() {
    setup:
      def subject = new Last2()
    expect:
      subject.last2('hixxhi') == 1
      subject.last2('xaxxaxaxx') == 1
      subject.last2('axxxaaxx') == 2
      subject.last2('xxaxxaxxaxx') == 3
      subject.last2('xaxaxaxx') == 0
      subject.last2('xxxx') == 2
      subject.last2('13121312') == 1
      subject.last2('11212') == 1
      subject.last2('13121311') == 0
      subject.last2('1717171') == 2
      subject.last2('hi') == 0
      subject.last2('h') == 0
      subject.last2('') == 0
  }
}

