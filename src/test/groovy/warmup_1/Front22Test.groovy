package warmup_1;

import spock.lang.Specification

class Front22Test extends Specification {
  def 'front22'() {
    setup:
      def subject = new Front22()
    expect:
      subject.front22('kitten') == "kikittenki"
      subject.front22('Ha') == "HaHaHa"
      subject.front22('abc') == "ababcab"
      subject.front22('ab') == "ababab"
      subject.front22('a') == "aaa"
      subject.front22('') == ""
      subject.front22('Logic') == "LoLogicLo"
  }
}

