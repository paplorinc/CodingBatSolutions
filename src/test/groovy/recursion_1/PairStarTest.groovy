package recursion_1;

import spock.lang.Specification

class PairStarTest extends Specification {
  def 'pairStar'() {
    setup:
      def subject = new PairStar()
    expect:
      subject.pairStar('hello') == "hel*lo"
      subject.pairStar('xxyy') == "x*xy*y"
      subject.pairStar('aaaa') == "a*a*a*a"
      subject.pairStar('aaab') == "a*a*ab"
      subject.pairStar('aa') == "a*a"
      subject.pairStar('a') == "a"
      subject.pairStar('') == ""
      subject.pairStar('noadjacent') == "noadjacent"
      subject.pairStar('abba') == "ab*ba"
      subject.pairStar('abbba') == "ab*b*ba"
  }
}

