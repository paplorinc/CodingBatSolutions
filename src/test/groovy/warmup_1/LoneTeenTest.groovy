package warmup_1;

import spock.lang.Specification

class LoneTeenTest extends Specification {
  def 'loneTeen'() {
    setup:
      def subject = new LoneTeen()
    expect:
      subject.loneTeen(13, 99) == true
      subject.loneTeen(21, 19) == true
      subject.loneTeen(13, 13) == false
      subject.loneTeen(14, 20) == true
      subject.loneTeen(20, 15) == true
      subject.loneTeen(16, 17) == false
      subject.loneTeen(16, 9) == true
      subject.loneTeen(16, 18) == false
      subject.loneTeen(13, 19) == false
      subject.loneTeen(13, 20) == true
      subject.loneTeen(6, 18) == true
      subject.loneTeen(99, 13) == true
      subject.loneTeen(99, 99) == false
  }
}

