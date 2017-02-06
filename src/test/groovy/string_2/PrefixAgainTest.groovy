package string_2;

import spock.lang.Specification

class PrefixAgainTest extends Specification {
  def 'prefixAgain'() {
    setup:
      def subject = new PrefixAgain()
    expect:
      subject.prefixAgain('abXYabc', 1) == true
      subject.prefixAgain('abXYabc', 2) == true
      subject.prefixAgain('abXYabc', 3) == false
      subject.prefixAgain('xyzxyxyxy', 2) == true
      subject.prefixAgain('xyzxyxyxy', 3) == false
      subject.prefixAgain('Hi12345Hi6789Hi10', 1) == true
      subject.prefixAgain('Hi12345Hi6789Hi10', 2) == true
      subject.prefixAgain('Hi12345Hi6789Hi10', 3) == true
      subject.prefixAgain('Hi12345Hi6789Hi10', 4) == false
      subject.prefixAgain('a', 1) == false
      subject.prefixAgain('aa', 1) == true
      subject.prefixAgain('ab', 1) == false
  }
}

