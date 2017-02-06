package string_1;

import spock.lang.Specification

class Left2Test extends Specification {
  def 'left2'() {
    setup:
      def subject = new Left2()
    expect:
      subject.left2('Hello') == "lloHe"
      subject.left2('java') == "vaja"
      subject.left2('Hi') == "Hi"
      subject.left2('code') == "deco"
      subject.left2('cat') == "tca"
      subject.left2('12345') == "34512"
      subject.left2('Chocolate') == "ocolateCh"
      subject.left2('bricks') == "icksbr"
  }
}

