package recursion_1;

import spock.lang.Specification

class StrCountTest extends Specification {
  def 'strCount'() {
    setup:
      def subject = new StrCount()
    expect:
      subject.strCount('catcowcat', 'cat') == 2
      subject.strCount('catcowcat', 'cow') == 1
      subject.strCount('catcowcat', 'dog') == 0
      subject.strCount('cacatcowcat', 'cat') == 2
      subject.strCount('xyx', 'x') == 2
      subject.strCount('iiiijj', 'i') == 4
      subject.strCount('iiiijj', 'ii') == 2
      subject.strCount('iiiijj', 'iii') == 1
      subject.strCount('iiiijj', 'j') == 2
      subject.strCount('iiiijj', 'jj') == 1
      subject.strCount('aaabababab', 'ab') == 4
      subject.strCount('aaabababab', 'aa') == 1
      subject.strCount('aaabababab', 'a') == 6
      subject.strCount('aaabababab', 'b') == 4
  }
}

