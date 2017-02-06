package warmup_2;

import spock.lang.Specification

class AltPairsTest extends Specification {
  def 'altPairs'() {
    setup:
      def subject = new AltPairs()
    expect:
      subject.altPairs('kitten') == "kien"
      subject.altPairs('Chocolate') == "Chole"
      subject.altPairs('CodingHorror') == "Congrr"
      subject.altPairs('yak') == "ya"
      subject.altPairs('ya') == "ya"
      subject.altPairs('y') == "y"
      subject.altPairs('') == ""
      subject.altPairs('ThisThatTheOther') == "ThThThth"
  }
}

