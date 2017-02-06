package array_1;

import spock.lang.Specification

class MakePiTest extends Specification {
  def 'makePi'() {
    setup:
      def subject = new MakePi()
    expect:
      subject.makePi() == [3, 1, 4]
  }
}

