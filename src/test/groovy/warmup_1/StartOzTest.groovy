package warmup_1;

import spock.lang.Specification

class StartOzTest extends Specification {
  def 'startOz'() {
    setup:
      def subject = new StartOz()
    expect:
      subject.startOz('ozymandias') == "oz"
      subject.startOz('bzoo') == "z"
      subject.startOz('oxx') == "o"
      subject.startOz('oz') == "oz"
      subject.startOz('ounce') == "o"
      subject.startOz('o') == "o"
      subject.startOz('abc') == ""
      subject.startOz('') == ""
      subject.startOz('zoo') == ""
      subject.startOz('aztec') == "z"
      subject.startOz('zzzz') == "z"
      subject.startOz('oznic') == "oz"
  }
}

