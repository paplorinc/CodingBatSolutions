package warmup_1;

import spock.lang.Specification

class In3050Test extends Specification {
  def 'in3050'() {
    setup:
      def subject = new In3050()
    expect:
      subject.in3050(30, 31) == true
      subject.in3050(30, 41) == false
      subject.in3050(40, 50) == true
      subject.in3050(40, 51) == false
      subject.in3050(39, 50) == false
      subject.in3050(50, 39) == false
      subject.in3050(40, 39) == true
      subject.in3050(49, 48) == true
      subject.in3050(50, 40) == true
      subject.in3050(50, 51) == false
      subject.in3050(35, 36) == true
      subject.in3050(35, 45) == false
  }
}

