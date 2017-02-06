package string_1;

import spock.lang.Specification

class TwoCharTest extends Specification {
  def 'twoChar'() {
    setup:
      def subject = new TwoChar()
    expect:
      subject.twoChar('java', 0) == "ja"
      subject.twoChar('java', 2) == "va"
      subject.twoChar('java', 3) == "ja"
      subject.twoChar('java', 4) == "ja"
      subject.twoChar('java', -1) == "ja"
      subject.twoChar('Hello', 0) == "He"
      subject.twoChar('Hello', 1) == "el"
      subject.twoChar('Hello', 99) == "He"
      subject.twoChar('Hello', 3) == "lo"
      subject.twoChar('Hello', 4) == "He"
      subject.twoChar('Hello', 5) == "He"
      subject.twoChar('Hello', -7) == "He"
      subject.twoChar('Hello', 6) == "He"
      subject.twoChar('Hello', -1) == "He"
      subject.twoChar('yay', 0) == "ya"
  }
}

