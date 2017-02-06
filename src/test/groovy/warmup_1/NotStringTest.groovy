package warmup_1;

import spock.lang.Specification

class NotStringTest extends Specification {
  def 'notString'() {
    setup:
      def subject = new NotString()
    expect:
      subject.notString('candy') == "not candy"
      subject.notString('x') == "not x"
      subject.notString('not bad') == "not bad"
      subject.notString('bad') == "not bad"
      subject.notString('not') == "not"
      subject.notString('is not') == "not is not"
      subject.notString('no') == "not no"
  }
}

