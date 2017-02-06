package array_2;

import spock.lang.Specification

class FizzArray2Test extends Specification {
  def 'fizzArray2'() {
    setup:
      def subject = new FizzArray2()
    expect:
      subject.fizzArray2(4) == ["0", "1", "2", "3"]
      subject.fizzArray2(10) == ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
      subject.fizzArray2(2) == ["0", "1"]
      subject.fizzArray2(1) == ["0"]
      subject.fizzArray2(0) == []
      subject.fizzArray2(7) == ["0", "1", "2", "3", "4", "5", "6"]
      subject.fizzArray2(9) == ["0", "1", "2", "3", "4", "5", "6", "7", "8"]
      subject.fizzArray2(11) == ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
  }
}

