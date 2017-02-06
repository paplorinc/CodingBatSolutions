package string_1;

import spock.lang.Specification

class NonStartTest extends Specification {
  def 'nonStart'() {
    setup:
      def subject = new NonStart()
    expect:
      subject.nonStart('Hello', 'There') == "ellohere"
      subject.nonStart('java', 'code') == "avaode"
      subject.nonStart('shotl', 'java') == "hotlava"
      subject.nonStart('ab', 'xy') == "by"
      subject.nonStart('ab', 'x') == "b"
      subject.nonStart('x', 'ac') == "c"
      subject.nonStart('a', 'x') == ""
      subject.nonStart('kit', 'kat') == "itat"
      subject.nonStart('mart', 'dart') == "artart"
  }
}

