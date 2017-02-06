package logic_2;

import spock.lang.Specification

class MakeBricksTest extends Specification {
  def 'makeBricks'() {
    setup:
      def subject = new MakeBricks()
    expect:
      subject.makeBricks(3, 1, 8) == true
      subject.makeBricks(3, 1, 9) == false
      subject.makeBricks(3, 2, 10) == true
      subject.makeBricks(3, 2, 8) == true
      subject.makeBricks(3, 2, 9) == false
      subject.makeBricks(6, 1, 11) == true
      subject.makeBricks(6, 0, 11) == false
      subject.makeBricks(1, 4, 11) == true
      subject.makeBricks(0, 3, 10) == true
      subject.makeBricks(1, 4, 12) == false
      subject.makeBricks(3, 1, 7) == true
      subject.makeBricks(1, 1, 7) == false
      subject.makeBricks(2, 1, 7) == true
      subject.makeBricks(7, 1, 11) == true
      subject.makeBricks(7, 1, 8) == true
      subject.makeBricks(7, 1, 13) == false
      subject.makeBricks(43, 1, 46) == true
      subject.makeBricks(40, 1, 46) == false
      subject.makeBricks(40, 2, 47) == true
      subject.makeBricks(40, 2, 50) == true
      subject.makeBricks(40, 2, 52) == false
      subject.makeBricks(22, 2, 33) == false
      subject.makeBricks(0, 2, 10) == true
      subject.makeBricks(1000000, 1000, 1000100) == true
      subject.makeBricks(2, 1000000, 100003) == false
      subject.makeBricks(20, 0, 19) == true
      subject.makeBricks(20, 0, 21) == false
      subject.makeBricks(20, 4, 51) == false
      subject.makeBricks(20, 4, 39) == true
  }
}

