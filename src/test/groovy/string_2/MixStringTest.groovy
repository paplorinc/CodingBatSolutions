package string_2;

import spock.lang.Specification

class MixStringTest extends Specification {
  def 'mixString'() {
    setup:
      def subject = new MixString()
    expect:
      subject.mixString('abc', 'xyz') == "axbycz"
      subject.mixString('Hi', 'There') == "HTihere"
      subject.mixString('xxxx', 'There') == "xTxhxexre"
      subject.mixString('xxx', 'X') == "xXxx"
      subject.mixString('2/', '27 around') == "22/7 around"
      subject.mixString('', 'Hello') == "Hello"
      subject.mixString('Abc', '') == "Abc"
      subject.mixString('', '') == ""
      subject.mixString('a', 'b') == "ab"
      subject.mixString('ax', 'b') == "abx"
      subject.mixString('a', 'bx') == "abx"
      subject.mixString('So', 'Long') == "SLoong"
      subject.mixString('Long', 'So') == "LSoong"
  }
}

