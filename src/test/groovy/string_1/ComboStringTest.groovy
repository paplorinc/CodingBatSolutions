package string_1;

import spock.lang.Specification

class ComboStringTest extends Specification {
  def 'comboString'() {
    setup:
      def subject = new ComboString()
    expect:
      subject.comboString('Hello', 'hi') == "hiHellohi"
      subject.comboString('hi', 'Hello') == "hiHellohi"
      subject.comboString('aaa', 'b') == "baaab"
      subject.comboString('b', 'aaa') == "baaab"
      subject.comboString('aaa', '') == "aaa"
      subject.comboString('', 'bb') == "bb"
      subject.comboString('aaa', '1234') == "aaa1234aaa"
      subject.comboString('aaa', 'bb') == "bbaaabb"
      subject.comboString('a', 'bb') == "abba"
      subject.comboString('bb', 'a') == "abba"
      subject.comboString('xyz', 'ab') == "abxyzab"
  }
}

