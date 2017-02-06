package string_1;

import spock.lang.Specification

class MakeOutWordTest extends Specification {
  def 'makeOutWord'() {
    setup:
      def subject = new MakeOutWord()
    expect:
      subject.makeOutWord('<<>>', 'Yay') == "<<Yay>>"
      subject.makeOutWord('<<>>', 'WooHoo') == "<<WooHoo>>"
      subject.makeOutWord('[[]]', 'word') == "[[word]]"
      subject.makeOutWord('HHoo', 'Hello') == "HHHellooo"
      subject.makeOutWord('abyz', 'YAY') == "abYAYyz"
  }
}

