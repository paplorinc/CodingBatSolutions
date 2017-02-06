package ap_1;

import spock.lang.Specification

class DividesSelfTest extends Specification {
  def 'dividesSelf'() {
    setup:
      def subject = new DividesSelf()
    expect:
      subject.dividesSelf(128) == true
      subject.dividesSelf(12) == true
      subject.dividesSelf(120) == false
      subject.dividesSelf(122) == true
      subject.dividesSelf(13) == false
      subject.dividesSelf(32) == false
      subject.dividesSelf(22) == true
      subject.dividesSelf(42) == false
      subject.dividesSelf(212) == true
      subject.dividesSelf(213) == false
      subject.dividesSelf(162) == true
  }
}

