package string_3;

import spock.lang.Specification

class MirrorEndsTest extends Specification {
  def 'mirrorEnds'() {
    setup:
      def subject = new MirrorEnds()
    expect:
      subject.mirrorEnds('abXYZba') == "ab"
      subject.mirrorEnds('abca') == "a"
      subject.mirrorEnds('aba') == "aba"
      subject.mirrorEnds('abab') == ""
      subject.mirrorEnds('xxx') == "xxx"
      subject.mirrorEnds('xxYxx') == "xxYxx"
      subject.mirrorEnds('Hi and iH') == "Hi "
      subject.mirrorEnds('x') == "x"
      subject.mirrorEnds('') == ""
      subject.mirrorEnds('123and then 321') == "123"
      subject.mirrorEnds('band andab') == "ba"
  }
}

