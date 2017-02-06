package warmup_1;

import spock.lang.Specification

class Front3Test extends Specification {
  def 'front3'() {
    setup:
      def subject = new Front3()
    expect:
      subject.front3('Java') == "JavJavJav"
      subject.front3('Chocolate') == "ChoChoCho"
      subject.front3('abc') == "abcabcabc"
      subject.front3('abcXYZ') == "abcabcabc"
      subject.front3('ab') == "ababab"
      subject.front3('a') == "aaa"
      subject.front3('') == ""
  }
}

