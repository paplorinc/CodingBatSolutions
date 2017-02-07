package recursion_1;

import spock.lang.Specification

class BunnyEars2Test extends Specification {
  def 'bunnyEars2'() {
    setup:
      def subject = new BunnyEars2()
    expect:
      subject.bunnyEars2(0) == 0
      subject.bunnyEars2(1) == 2
      subject.bunnyEars2(2) == 5
      subject.bunnyEars2(3) == 7
      subject.bunnyEars2(4) == 10
      subject.bunnyEars2(5) == 12
      subject.bunnyEars2(6) == 15
      subject.bunnyEars2(10) == 25
  }
}

