package warmup_1;

import spock.lang.Specification

class EveryNthTest extends Specification {
  def 'everyNth'() {
    setup:
      def subject = new EveryNth()
    expect:
      subject.everyNth('Miracle', 2) == "Mrce"
      subject.everyNth('abcdefg', 2) == "aceg"
      subject.everyNth('abcdefg', 3) == "adg"
      subject.everyNth('Chocolate', 3) == "Cca"
      subject.everyNth('Chocolates', 3) == "Ccas"
      subject.everyNth('Chocolates', 4) == "Coe"
      subject.everyNth('Chocolates', 100) == "C"
  }
}

