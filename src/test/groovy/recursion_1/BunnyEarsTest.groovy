package recursion_1;

import spock.lang.Specification

class BunnyEarsTest extends Specification {
  def 'bunnyEars'() {
    setup:
      def subject = new BunnyEars()
    expect:
      subject.bunnyEars(0) == 0
      subject.bunnyEars(1) == 2
      subject.bunnyEars(2) == 4
      subject.bunnyEars(3) == 6
      subject.bunnyEars(4) == 8
      subject.bunnyEars(5) == 10
      subject.bunnyEars(12) == 24
      subject.bunnyEars(50) == 100
      subject.bunnyEars(234) == 468
  }
}

