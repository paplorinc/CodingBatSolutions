package string_2;

import spock.lang.Specification

class StarOutTest extends Specification {
  def 'starOut'() {
    setup:
      def subject = new StarOut()
    expect:
      subject.starOut('ab*cd') == "ad"
      subject.starOut('ab**cd') == "ad"
      subject.starOut('sm*eilly') == "silly"
      subject.starOut('sm*eil*ly') == "siy"
      subject.starOut('sm**eil*ly') == "siy"
      subject.starOut('sm***eil*ly') == "siy"
      subject.starOut('stringy*') == "string"
      subject.starOut('*stringy') == "tringy"
      subject.starOut('*str*in*gy') == "ty"
      subject.starOut('abc') == "abc"
      subject.starOut('a*bc') == "c"
      subject.starOut('ab') == "ab"
      subject.starOut('a*b') == ""
      subject.starOut('a') == "a"
      subject.starOut('a*') == ""
      subject.starOut('*a') == ""
      subject.starOut('*') == ""
      subject.starOut('') == ""
  }
}

