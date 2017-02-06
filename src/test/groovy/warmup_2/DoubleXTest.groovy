package warmup_2;

import spock.lang.Specification

class DoubleXTest extends Specification {
  def 'doubleX'() {
    setup:
      def subject = new DoubleX()
    expect:
      subject.doubleX('axxbb') == true
      subject.doubleX('axaxax') == false
      subject.doubleX('xxxxx') == true
      subject.doubleX('xaxxx') == false
      subject.doubleX('aaaax') == false
      subject.doubleX('') == false
      subject.doubleX('abc') == false
      subject.doubleX('x') == false
      subject.doubleX('xx') == true
      subject.doubleX('xax') == false
      subject.doubleX('xaxx') == false
  }
}

