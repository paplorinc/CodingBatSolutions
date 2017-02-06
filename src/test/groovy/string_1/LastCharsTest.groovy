package string_1;

import spock.lang.Specification

class LastCharsTest extends Specification {
  def 'lastChars'() {
    setup:
      def subject = new LastChars()
    expect:
      subject.lastChars('last', 'chars') == "ls"
      subject.lastChars('yo', 'java') == "ya"
      subject.lastChars('hi', '') == "h@"
      subject.lastChars('', 'hello') == "@o"
      subject.lastChars('', '') == "@@"
      subject.lastChars('kitten', 'hi') == "ki"
      subject.lastChars('k', 'zip') == "kp"
      subject.lastChars('kitten', '') == "k@"
      subject.lastChars('kitten', 'zip') == "kp"
  }
}

