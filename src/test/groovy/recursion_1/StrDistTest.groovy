package recursion_1;

import spock.lang.Specification

class StrDistTest extends Specification {
  def 'strDist'() {
    setup:
      def subject = new StrDist()
    expect:
      subject.strDist('catcowcat', 'cat') == 9
      subject.strDist('catcowcat', 'cow') == 3
      subject.strDist('cccatcowcatxx', 'cat') == 9
      subject.strDist('abccatcowcatcatxyz', 'cat') == 12
      subject.strDist('xyx', 'x') == 3
      subject.strDist('xyx', 'y') == 1
      subject.strDist('xyx', 'z') == 0
      subject.strDist('z', 'z') == 1
      subject.strDist('x', 'z') == 0
      subject.strDist('', 'z') == 0
      subject.strDist('hiHellohihihi', 'hi') == 13
      subject.strDist('hiHellohihihi', 'hih') == 5
      subject.strDist('hiHellohihihi', 'o') == 1
      subject.strDist('hiHellohihihi', 'll') == 2
  }
}

