package ap_1;

import spock.lang.Specification

class HasOneTest extends Specification {
  def 'hasOne'() {
    setup:
      def subject = new HasOne()
    expect:
      subject.hasOne(10) == true
      subject.hasOne(22) == false
      subject.hasOne(220) == false
      subject.hasOne(212) == true
      subject.hasOne(1) == true
      subject.hasOne(9) == false
      subject.hasOne(211112) == true
      subject.hasOne(121121) == true
      subject.hasOne(222222) == false
      subject.hasOne(56156) == true
      subject.hasOne(56556) == false
  }
}

