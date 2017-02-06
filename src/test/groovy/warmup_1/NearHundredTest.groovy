package warmup_1;

import spock.lang.Specification

class NearHundredTest extends Specification {
  def 'nearHundred'() {
    setup:
      def subject = new NearHundred()
    expect:
      subject.nearHundred(93) == true
      subject.nearHundred(90) == true
      subject.nearHundred(89) == false
      subject.nearHundred(110) == true
      subject.nearHundred(111) == false
      subject.nearHundred(121) == false
      subject.nearHundred(-101) == false
      subject.nearHundred(-209) == false
      subject.nearHundred(190) == true
      subject.nearHundred(209) == true
      subject.nearHundred(0) == false
      subject.nearHundred(5) == false
      subject.nearHundred(-50) == false
      subject.nearHundred(191) == true
      subject.nearHundred(189) == false
      subject.nearHundred(200) == true
      subject.nearHundred(210) == true
      subject.nearHundred(211) == false
      subject.nearHundred(290) == false
  }
}

