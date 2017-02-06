package string_2;

import spock.lang.Specification

class XyzMiddleTest extends Specification {
  def 'xyzMiddle'() {
    setup:
      def subject = new XyzMiddle()
    expect:
      subject.xyzMiddle('AAxyzBB') == true
      subject.xyzMiddle('AxyzBB') == true
      subject.xyzMiddle('AxyzBBB') == false
      subject.xyzMiddle('AxyzBBBB') == false
      subject.xyzMiddle('AAAxyzB') == false
      subject.xyzMiddle('AAAxyzBB') == true
      subject.xyzMiddle('AAAAxyzBB') == false
      subject.xyzMiddle('AAAAAxyzBBB') == false
      subject.xyzMiddle('1x345xyz12x4') == true
      subject.xyzMiddle('xyzAxyzBBB') == true
      subject.xyzMiddle('xyzAxyzBxyz') == true
      subject.xyzMiddle('xyzxyzAxyzBxyzxyz') == true
      subject.xyzMiddle('xyzxyzxyzBxyzxyz') == true
      subject.xyzMiddle('xyzxyzAxyzxyzxyz') == true
      subject.xyzMiddle('xyzxyzAxyzxyzxy') == false
      subject.xyzMiddle('AxyzxyzBB') == false
      subject.xyzMiddle('') == false
      subject.xyzMiddle('x') == false
      subject.xyzMiddle('xy') == false
      subject.xyzMiddle('xyz') == true
      subject.xyzMiddle('xyzz') == true
  }
}

