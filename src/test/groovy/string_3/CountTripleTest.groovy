package string_3;

import spock.lang.Specification

class CountTripleTest extends Specification {
  def 'countTriple'() {
    setup:
      def subject = new CountTriple()
    expect:
      subject.countTriple('abcXXXabc') == 1
      subject.countTriple('xxxabyyyycd') == 3
      subject.countTriple('a') == 0
      subject.countTriple('') == 0
      subject.countTriple('XXXabc') == 1
      subject.countTriple('XXXXabc') == 2
      subject.countTriple('XXXXXabc') == 3
      subject.countTriple('222abyyycdXXX') == 3
      subject.countTriple('abYYYabXXXXXab') == 4
      subject.countTriple('abYYXabXXYXXab') == 0
      subject.countTriple('abYYXabXXYXXab') == 0
      subject.countTriple('122abhhh2') == 1
  }
}

