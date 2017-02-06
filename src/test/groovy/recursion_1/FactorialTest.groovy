package recursion_1;

import spock.lang.Specification

class FactorialTest extends Specification {
  def 'factorial'() {
    setup:
      def subject = new Factorial()
    expect:
      subject.factorial(1) == 1
      subject.factorial(2) == 2
      subject.factorial(3) == 6
      subject.factorial(4) == 24
      subject.factorial(5) == 120
      subject.factorial(6) == 720
      subject.factorial(7) == 5040
      subject.factorial(8) == 40320
      subject.factorial(12) == 479001600
  }
}

