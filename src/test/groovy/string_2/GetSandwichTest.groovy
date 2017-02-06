package string_2;

import spock.lang.Specification

class GetSandwichTest extends Specification {
  def 'getSandwich'() {
    setup:
      def subject = new GetSandwich()
    expect:
      subject.getSandwich('breadjambread') == "jam"
      subject.getSandwich('xxbreadjambreadyy') == "jam"
      subject.getSandwich('xxbreadyy') == ""
      subject.getSandwich('xxbreadbreadjambreadyy') == "breadjam"
      subject.getSandwich('breadAbread') == "A"
      subject.getSandwich('breadbread') == ""
      subject.getSandwich('abcbreaz') == ""
      subject.getSandwich('xyz') == ""
      subject.getSandwich('') == ""
      subject.getSandwich('breadbreaxbread') == "breax"
      subject.getSandwich('breaxbreadybread') == "y"
      subject.getSandwich('breadbreadbreadbread') == "breadbread"
  }
}

