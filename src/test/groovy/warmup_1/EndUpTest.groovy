package warmup_1;

import spock.lang.Specification

class EndUpTest extends Specification {
  def 'endUp'() {
    setup:
      def subject = new EndUp()
    expect:
      subject.endUp('Hello') == "HeLLO"
      subject.endUp('hi there') == "hi thERE"
      subject.endUp('hi') == "HI"
      subject.endUp('woo hoo') == "woo HOO"
      subject.endUp('xyz12') == "xyZ12"
      subject.endUp('x') == "X"
      subject.endUp('') == ""
  }
}

