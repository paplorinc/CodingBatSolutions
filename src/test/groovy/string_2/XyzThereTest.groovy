package string_2;

import spock.lang.Specification

class XyzThereTest extends Specification {
  def 'xyzThere'() {
    setup:
      def subject = new XyzThere()
    expect:
      subject.xyzThere('abcxyz') == true
      subject.xyzThere('abc.xyz') == false
      subject.xyzThere('xyz.abc') == true
      subject.xyzThere('abcxy') == false
      subject.xyzThere('xyz') == true
      subject.xyzThere('xy') == false
      subject.xyzThere('x') == false
      subject.xyzThere('') == false
      subject.xyzThere('abc.xyzxyz') == true
      subject.xyzThere('abc.xxyz') == true
      subject.xyzThere('.xyz') == false
      subject.xyzThere('12.xyz') == false
      subject.xyzThere('12xyz') == true
      subject.xyzThere('1.xyz.xyz2.xyz') == false
  }
}

