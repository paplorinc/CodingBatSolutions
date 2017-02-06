package string_2;

import spock.lang.Specification

class DoubleCharTest extends Specification {
  def 'doubleChar'() {
    setup:
      def subject = new DoubleChar()
    expect:
      subject.doubleChar('The') == "TThhee"
      subject.doubleChar('AAbb') == "AAAAbbbb"
      subject.doubleChar('Hi-There') == "HHii--TThheerree"
      subject.doubleChar('Word!') == "WWoorrdd!!"
      subject.doubleChar('!!') == "!!!!"
      subject.doubleChar('') == ""
      subject.doubleChar('a') == "aa"
      subject.doubleChar('.') == ".."
      subject.doubleChar('aa') == "aaaa"
  }
}

