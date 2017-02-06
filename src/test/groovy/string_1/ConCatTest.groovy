package string_1;

import spock.lang.Specification

class ConCatTest extends Specification {
  def 'conCat'() {
    setup:
      def subject = new ConCat()
    expect:
      subject.conCat('abc', 'cat') == "abcat"
      subject.conCat('dog', 'cat') == "dogcat"
      subject.conCat('abc', '') == "abc"
      subject.conCat('', 'cat') == "cat"
      subject.conCat('pig', 'g') == "pig"
      subject.conCat('pig', 'doggy') == "pigdoggy"
  }
}

