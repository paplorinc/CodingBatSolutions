package string_1;

import spock.lang.Specification

class Right2Test extends Specification {
  def 'right2'() {
    setup:
      def subject = new Right2()
    expect:
      subject.right2('Hello') == "loHel"
      subject.right2('java') == "vaja"
      subject.right2('Hi') == "Hi"
      subject.right2('code') == "deco"
      subject.right2('cat') == "atc"
      subject.right2('12345') == "45123"
  }
}

