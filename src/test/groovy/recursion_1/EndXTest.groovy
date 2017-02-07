package recursion_1;

import spock.lang.Specification

class EndXTest extends Specification {
  def 'endX'() {
    setup:
      def subject = new EndX()
    expect:
      subject.endX('xxre') == "rexx"
      subject.endX('xxhixx') == "hixxxx"
      subject.endX('xhixhix') == "hihixxx"
      subject.endX('hiy') == "hiy"
      subject.endX('h') == "h"
      subject.endX('x') == "x"
      subject.endX('xx') == "xx"
      subject.endX('') == ""
      subject.endX('bxx') == "bxx"
      subject.endX('bxax') == "baxx"
      subject.endX('axaxax') == "aaaxxx"
      subject.endX('xxhxi') == "hixxx"
  }
}

