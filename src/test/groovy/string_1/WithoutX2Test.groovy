package string_1;

import spock.lang.Specification

class WithoutX2Test extends Specification {
  def 'withoutX2'() {
    setup:
      def subject = new WithoutX2()
    expect:
      subject.withoutX2('xHi') == "Hi"
      subject.withoutX2('Hxi') == "Hi"
      subject.withoutX2('Hi') == "Hi"
      subject.withoutX2('xxHi') == "Hi"
      subject.withoutX2('Hix') == "Hix"
      subject.withoutX2('xaxb') == "axb"
      subject.withoutX2('xx') == ""
      subject.withoutX2('x') == ""
      subject.withoutX2('') == ""
      subject.withoutX2('Hello') == "Hello"
      subject.withoutX2('Hexllo') == "Hexllo"
      subject.withoutX2('xHxllo') == "Hxllo"
  }
}

