package warmup_1;

import spock.lang.Specification

class HasTeenTest extends Specification {
  def 'hasTeen'() {
    setup:
      def subject = new HasTeen()
    expect:
      subject.hasTeen(13, 20, 10) == true
      subject.hasTeen(20, 19, 10) == true
      subject.hasTeen(20, 10, 13) == true
      subject.hasTeen(1, 20, 12) == false
      subject.hasTeen(19, 20, 12) == true
      subject.hasTeen(12, 20, 19) == true
      subject.hasTeen(12, 9, 20) == false
      subject.hasTeen(12, 18, 20) == true
      subject.hasTeen(14, 2, 20) == true
      subject.hasTeen(4, 2, 20) == false
      subject.hasTeen(11, 22, 22) == false
  }
}

