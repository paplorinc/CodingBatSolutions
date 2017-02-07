package recursion_1;

import spock.lang.Specification

class CountHi2Test extends Specification {
  def 'countHi2'() {
    setup:
      def subject = new CountHi2()
    expect:
      subject.countHi2('ahixhi') == 1
      subject.countHi2('ahibhi') == 2
      subject.countHi2('xhixhi') == 0
      subject.countHi2('hixhi') == 1
      subject.countHi2('hixhhi') == 2
      subject.countHi2('hihihi') == 3
      subject.countHi2('hihihix') == 3
      subject.countHi2('xhihihix') == 2
      subject.countHi2('xxhi') == 0
      subject.countHi2('hixxhi') == 1
      subject.countHi2('hi') == 1
      subject.countHi2('xxxx') == 0
      subject.countHi2('h') == 0
      subject.countHi2('x') == 0
      subject.countHi2('') == 0
      subject.countHi2('Hellohi') == 1
  }
}

