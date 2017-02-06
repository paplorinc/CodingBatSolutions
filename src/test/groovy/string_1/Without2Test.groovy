package string_1;

import spock.lang.Specification

class Without2Test extends Specification {
  def 'without2'() {
    setup:
      def subject = new Without2()
    expect:
      subject.without2('HelloHe') == "lloHe"
      subject.without2('HelloHi') == "HelloHi"
      subject.without2('Hi') == ""
      subject.without2('Chocolate') == "Chocolate"
      subject.without2('xxx') == "x"
      subject.without2('xx') == ""
      subject.without2('x') == "x"
      subject.without2('') == ""
      subject.without2('Fruits') == "Fruits"
  }
}

