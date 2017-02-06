package string_1;

import spock.lang.Specification

class FirstHalfTest extends Specification {
  def 'firstHalf'() {
    setup:
      def subject = new FirstHalf()
    expect:
      subject.firstHalf('WooHoo') == "Woo"
      subject.firstHalf('HelloThere') == "Hello"
      subject.firstHalf('abcdef') == "abc"
      subject.firstHalf('ab') == "a"
      subject.firstHalf('') == ""
      subject.firstHalf('0123456789') == "01234"
      subject.firstHalf('kitten') == "kit"
  }
}

