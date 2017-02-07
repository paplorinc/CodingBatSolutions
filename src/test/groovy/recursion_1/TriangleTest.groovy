package recursion_1;

import spock.lang.Specification

class TriangleTest extends Specification {
  def 'triangle'() {
    setup:
      def subject = new Triangle()
    expect:
      subject.triangle(0) == 0
      subject.triangle(1) == 1
      subject.triangle(2) == 3
      subject.triangle(3) == 6
      subject.triangle(4) == 10
      subject.triangle(5) == 15
      subject.triangle(6) == 21
      subject.triangle(7) == 28
  }
}

