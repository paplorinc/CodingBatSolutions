package warmup_2;

import spock.lang.Specification

class StringBitsTest extends Specification {
  def 'stringBits'() {
    setup:
      def subject = new StringBits()
    expect:
      subject.stringBits('Hello') == "Hlo"
      subject.stringBits('Hi') == "H"
      subject.stringBits('Heeololeo') == "Hello"
      subject.stringBits('HiHiHi') == "HHH"
      subject.stringBits('') == ""
      subject.stringBits('Greetings') == "Getns"
      subject.stringBits('Chocoate') == "Coot"
      subject.stringBits('pi') == "p"
      subject.stringBits('Hello Kitten') == "HloKte"
      subject.stringBits('hxaxpxpxy') == "happy"
  }
}

