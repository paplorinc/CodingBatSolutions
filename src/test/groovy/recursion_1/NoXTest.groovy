package recursion_1;

import spock.lang.Specification

class NoXTest extends Specification {
  def 'noX'() {
    setup:
      def subject = new NoX()
    expect:
      subject.noX('xaxb') == "ab"
      subject.noX('abc') == "abc"
      subject.noX('xx') == ""
      subject.noX('') == ""
      subject.noX('axxbxx') == "ab"
      subject.noX('Hellox') == "Hello"
  }
}

