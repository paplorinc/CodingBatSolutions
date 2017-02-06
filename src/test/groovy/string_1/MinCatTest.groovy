package string_1;

import spock.lang.Specification

class MinCatTest extends Specification {
  def 'minCat'() {
    setup:
      def subject = new MinCat()
    expect:
      subject.minCat('Hello', 'Hi') == "loHi"
      subject.minCat('Hello', 'java') == "ellojava"
      subject.minCat('java', 'Hello') == "javaello"
      subject.minCat('abc', 'x') == "cx"
      subject.minCat('x', 'abc') == "xc"
      subject.minCat('abc', '') == ""
  }
}

