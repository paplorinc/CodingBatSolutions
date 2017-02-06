package string_2;

import spock.lang.Specification

class SameStarCharTest extends Specification {
  def 'sameStarChar'() {
    setup:
      def subject = new SameStarChar()
    expect:
      subject.sameStarChar('xy*yzz') == true
      subject.sameStarChar('xy*zzz') == false
      subject.sameStarChar('*xa*az') == true
      subject.sameStarChar('*xa*bz') == false
      subject.sameStarChar('*xa*a*') == true
      subject.sameStarChar('') == true
      subject.sameStarChar('*xa*a*a') == true
      subject.sameStarChar('*xa*a*b') == false
      subject.sameStarChar('*12*2*2') == true
      subject.sameStarChar('12*2*3*') == false
      subject.sameStarChar('abcDEF') == true
      subject.sameStarChar('XY*YYYY*Z*') == false
      subject.sameStarChar('XY*YYYY*Y*') == true
      subject.sameStarChar('12*2*3*') == false
      subject.sameStarChar('*') == true
      subject.sameStarChar('**') == true
  }
}

