package string_2;

import spock.lang.Specification

class PlusOutTest extends Specification {
  def 'plusOut'() {
    setup:
      def subject = new PlusOut()
    expect:
      subject.plusOut('12xy34', 'xy') == "++xy++"
      subject.plusOut('12xy34', '1') == "1+++++"
      subject.plusOut('12xy34xyabcxy', 'xy') == "++xy++xy+++xy"
      subject.plusOut('abXYabcXYZ', 'ab') == "ab++ab++++"
      subject.plusOut('abXYabcXYZ', 'abc') == "++++abc+++"
      subject.plusOut('abXYabcXYZ', 'XY') == "++XY+++XY+"
      subject.plusOut('abXYxyzXYZ', 'XYZ') == "+++++++XYZ"
      subject.plusOut('--++ab', '++') == "++++++"
      subject.plusOut('aaxxxxbb', 'xx') == "++xxxx++"
      subject.plusOut('123123', '3') == "++3++3"
  }
}

