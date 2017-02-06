package string_1;

import spock.lang.Specification

class WithoutXTest extends Specification {
  def 'withoutX'() {
    setup:
      def subject = new WithoutX()
    expect:
      subject.withoutX('xHix') == "Hi"
      subject.withoutX('xHi') == "Hi"
      subject.withoutX('Hxix') == "Hxi"
      subject.withoutX('Hi') == "Hi"
      subject.withoutX('xxHi') == "xHi"
      subject.withoutX('Hix') == "Hi"
      subject.withoutX('xaxbx') == "axb"
      subject.withoutX('xx') == ""
      subject.withoutX('x') == ""
      subject.withoutX('') == ""
      subject.withoutX('Hello') == "Hello"
      subject.withoutX('Hexllo') == "Hexllo"
  }
}

