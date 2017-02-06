package warmup_1;

import spock.lang.Specification

class MissingCharTest extends Specification {
  def 'missingChar'() {
    setup:
      def subject = new MissingChar()
    expect:
      subject.missingChar('kitten', 1) == "ktten"
      subject.missingChar('kitten', 0) == "itten"
      subject.missingChar('kitten', 4) == "kittn"
      subject.missingChar('Hi', 0) == "i"
      subject.missingChar('Hi', 1) == "H"
      subject.missingChar('code', 0) == "ode"
      subject.missingChar('code', 1) == "cde"
      subject.missingChar('code', 2) == "coe"
      subject.missingChar('code', 3) == "cod"
      subject.missingChar('chocolate', 8) == "chocolat"
  }
}

