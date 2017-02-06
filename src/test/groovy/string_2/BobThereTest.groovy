package string_2;

import spock.lang.Specification

class BobThereTest extends Specification {
  def 'bobThere'() {
    setup:
      def subject = new BobThere()
    expect:
      subject.bobThere('abcbob') == true
      subject.bobThere('b9b') == true
      subject.bobThere('bac') == false
      subject.bobThere('bbb') == true
      subject.bobThere('abcdefb') == false
      subject.bobThere('123abcbcdbabxyz') == true
      subject.bobThere('b12') == false
      subject.bobThere('b1b') == true
      subject.bobThere('b12b1b') == true
      subject.bobThere('bbc') == false
      subject.bobThere('bbb') == true
      subject.bobThere('bb') == false
      subject.bobThere('b') == false
  }
}

