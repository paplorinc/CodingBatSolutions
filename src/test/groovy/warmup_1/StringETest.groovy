package warmup_1;

import spock.lang.Specification

class StringETest extends Specification {
  def 'stringE'() {
    setup:
      def subject = new StringE()
    expect:
      subject.stringE('Hello') == true
      subject.stringE('Heelle') == true
      subject.stringE('Heelele') == false
      subject.stringE('Hll') == false
      subject.stringE('e') == true
      subject.stringE('') == false
  }
}

