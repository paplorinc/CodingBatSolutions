package string_1;

import spock.lang.Specification

class FrontAgainTest extends Specification {
  def 'frontAgain'() {
    setup:
      def subject = new FrontAgain()
    expect:
      subject.frontAgain('edited') == true
      subject.frontAgain('edit') == false
      subject.frontAgain('ed') == true
      subject.frontAgain('jj') == true
      subject.frontAgain('jjj') == true
      subject.frontAgain('jjjj') == true
      subject.frontAgain('jjjk') == false
      subject.frontAgain('x') == false
      subject.frontAgain('') == false
      subject.frontAgain('java') == false
      subject.frontAgain('javaja') == true
  }
}

