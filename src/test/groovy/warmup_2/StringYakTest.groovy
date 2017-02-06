package warmup_2;

import spock.lang.Specification

class StringYakTest extends Specification {
  def 'stringYak'() {
    setup:
      def subject = new StringYak()
    expect:
      subject.stringYak('yakpak') == "pak"
      subject.stringYak('pakyak') == "pak"
      subject.stringYak('yak123ya') == "123ya"
      subject.stringYak('yak') == ""
      subject.stringYak('yakxxxyak') == "xxx"
      subject.stringYak('HiyakHi') == "HiHi"
      subject.stringYak('xxxyakyyyakzzz') == "xxxyyzzz"
  }
}

