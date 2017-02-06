package warmup_2;

import spock.lang.Specification

class StringXTest extends Specification {
  def 'stringX'() {
    setup:
      def subject = new StringX()
    expect:
      subject.stringX('xxHxix') == "xHix"
      subject.stringX('abxxxcd') == "abcd"
      subject.stringX('xabxxxcdx') == "xabcdx"
      subject.stringX('xKittenx') == "xKittenx"
      subject.stringX('Hello') == "Hello"
      subject.stringX('xx') == "xx"
      subject.stringX('x') == "x"
      subject.stringX('') == ""
  }
}

