package warmup_1;

import spock.lang.Specification

class Close10Test extends Specification {
  def 'close10'() {
    setup:
      def subject = new Close10()
    expect:
      subject.close10(8, 13) == 8
      subject.close10(13, 8) == 8
      subject.close10(13, 7) == 0
      subject.close10(7, 13) == 0
      subject.close10(9, 13) == 9
      subject.close10(13, 8) == 8
      subject.close10(10, 12) == 10
      subject.close10(11, 10) == 10
      subject.close10(5, 21) == 5
      subject.close10(0, 20) == 0
      subject.close10(10, 10) == 0
  }
}

