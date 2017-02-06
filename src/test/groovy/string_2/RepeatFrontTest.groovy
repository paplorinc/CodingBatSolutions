package string_2;

import spock.lang.Specification

class RepeatFrontTest extends Specification {
  def 'repeatFront'() {
    setup:
      def subject = new RepeatFront()
    expect:
      subject.repeatFront('Chocolate', 4) == "ChocChoChC"
      subject.repeatFront('Chocolate', 3) == "ChoChC"
      subject.repeatFront('Ice Cream', 2) == "IcI"
      subject.repeatFront('Ice Cream', 1) == "I"
      subject.repeatFront('Ice Cream', 0) == ""
      subject.repeatFront('xyz', 3) == "xyzxyx"
      subject.repeatFront('', 0) == ""
      subject.repeatFront('Java', 4) == "JavaJavJaJ"
      subject.repeatFront('Java', 1) == "J"
  }
}

