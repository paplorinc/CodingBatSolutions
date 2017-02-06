package recursion_1;

import spock.lang.Specification

class FibonacciTest extends Specification {
  def 'fibonacci'() {
    setup:
      def subject = new Fibonacci()
    expect:
      subject.fibonacci(0) == 0
      subject.fibonacci(1) == 1
      subject.fibonacci(2) == 1
      subject.fibonacci(3) == 2
      subject.fibonacci(4) == 3
      subject.fibonacci(5) == 5
      subject.fibonacci(6) == 8
      subject.fibonacci(7) == 13
  }
}

