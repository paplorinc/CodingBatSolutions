package recursion_1;

import spock.lang.Specification

class Count8Test extends Specification {
  def 'count8'() {
    setup:
      def subject = new Count8()
    expect:
      subject.count8(8) == 1
      subject.count8(818) == 2
      subject.count8(8818) == 4
      subject.count8(8088) == 4
      subject.count8(123) == 0
      subject.count8(81238) == 2
      subject.count8(88788) == 6
      subject.count8(8234) == 1
      subject.count8(2348) == 1
      subject.count8(23884) == 3
      subject.count8(0) == 0
      subject.count8(1818188) == 5
      subject.count8(8818181) == 5
      subject.count8(1080) == 1
      subject.count8(188) == 3
      subject.count8(88888) == 9
      subject.count8(9898) == 2
      subject.count8(78) == 1
  }
}

