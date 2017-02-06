package string_2;

import spock.lang.Specification

class WordEndsTest extends Specification {
  def 'wordEnds'() {
    setup:
      def subject = new WordEnds()
    expect:
      subject.wordEnds('abcXY123XYijk', 'XY') == "c13i"
      subject.wordEnds('XY123XY', 'XY') == "13"
      subject.wordEnds('XY1XY', 'XY') == "11"
      subject.wordEnds('XYXY', 'XY') == "XY"
      subject.wordEnds('XY', 'XY') == ""
      subject.wordEnds('Hi', 'XY') == ""
      subject.wordEnds('', 'XY') == ""
      subject.wordEnds('abc1xyz1i1j', '1') == "cxziij"
      subject.wordEnds('abc1xyz1', '1') == "cxz"
      subject.wordEnds('abc1xyz11', '1') == "cxz11"
      subject.wordEnds('abc1xyz1abc', 'abc') == "11"
      subject.wordEnds('abc1xyz1abc', 'b') == "acac"
      subject.wordEnds('abc1abc1abc', 'abc') == "1111"
  }
}

