package string_2;

import spock.lang.Specification

class CountCodeTest extends Specification {
  def 'countCode'() {
    setup:
      def subject = new CountCode()
    expect:
      subject.countCode('aaacodebbb') == 1
      subject.countCode('codexxcode') == 2
      subject.countCode('cozexxcope') == 2
      subject.countCode('cozfxxcope') == 1
      subject.countCode('xxcozeyycop') == 1
      subject.countCode('cozcop') == 0
      subject.countCode('abcxyz') == 0
      subject.countCode('code') == 1
      subject.countCode('ode') == 0
      subject.countCode('c') == 0
      subject.countCode('') == 0
      subject.countCode('AAcodeBBcoleCCccoreDD') == 3
      subject.countCode('AAcodeBBcoleCCccorfDD') == 2
      subject.countCode('coAcodeBcoleccoreDD') == 3
  }
}

