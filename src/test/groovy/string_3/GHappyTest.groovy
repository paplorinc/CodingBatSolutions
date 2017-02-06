package string_3;

import spock.lang.Specification

class GHappyTest extends Specification {
  def 'gHappy'() {
    setup:
      def subject = new GHappy()
    expect:
      subject.gHappy('xxggxx') == true
      subject.gHappy('xxgxx') == false
      subject.gHappy('xxggyygxx') == false
      subject.gHappy('g') == false
      subject.gHappy('gg') == true
      subject.gHappy('') == true
      subject.gHappy('xxgggxyz') == true
      subject.gHappy('xxgggxyg') == false
      subject.gHappy('xxgggxygg') == true
      subject.gHappy('mgm') == false
      subject.gHappy('mggm') == true
      subject.gHappy('yyygggxyy') == true
  }
}

