package string_1;

import spock.lang.Specification

class ExtraEndTest extends Specification {
  def 'extraEnd'() {
    setup:
      def subject = new ExtraEnd()
    expect:
      subject.extraEnd('Hello') == "lololo"
      subject.extraEnd('ab') == "ababab"
      subject.extraEnd('Hi') == "HiHiHi"
      subject.extraEnd('Candy') == "dydydy"
      subject.extraEnd('Code') == "dedede"
  }
}

