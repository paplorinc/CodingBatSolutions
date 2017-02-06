package string_3;

import spock.lang.Specification

class SameEndsTest extends Specification {
  def 'sameEnds'() {
    setup:
      def subject = new SameEnds()
    expect:
      subject.sameEnds('abXYab') == "ab"
      subject.sameEnds('xx') == "x"
      subject.sameEnds('xxx') == "x"
      subject.sameEnds('xxxx') == "xx"
      subject.sameEnds('javaXYZjava') == "java"
      subject.sameEnds('javajava') == "java"
      subject.sameEnds('xavaXYZjava') == ""
      subject.sameEnds('Hello! and Hello!') == "Hello!"
      subject.sameEnds('x') == ""
      subject.sameEnds('') == ""
      subject.sameEnds('abcb') == ""
      subject.sameEnds('mymmy') == "my"
  }
}

