package warmup_1;

import spock.lang.Specification

class MixStartTest extends Specification {
  def 'mixStart'() {
    setup:
      def subject = new MixStart()
    expect:
      subject.mixStart('mix snacks') == true
      subject.mixStart('pix snacks') == true
      subject.mixStart('piz snacks') == false
      subject.mixStart('nix') == true
      subject.mixStart('ni') == false
      subject.mixStart('n') == false
      subject.mixStart('') == false
  }
}

